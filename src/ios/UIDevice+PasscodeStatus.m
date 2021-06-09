//
//  UIDevice+PasscodeStatus.m
//  PasscodeStatus
//
//  Created by Liam Nichols on 02/09/2014.
//  Copyright (c) 2014 Liam Nichols. All rights reserved.
//

#import "UIDevice+PasscodeStatus.h"
#import <Security/Security.h>

NSString * const UIDevicePasscodeKeychainService = @"UIDevice-PasscodeStatus_KeychainService";
NSString * const UIDevicePasscodeKeychainAccount = @"UIDevice-PasscodeStatus_KeychainAccount";

@implementation UIDevice (PasscodeStatus)

- (BOOL)passcodeStatusSupported
{
#if TARGET_IPHONE_SIMULATOR
    return NO;
#endif
    
#ifdef __IPHONE_8_0
    return (&kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly != NULL);
#else
    return NO;
#endif
}

- (NSString *)passcodeStatus
{
#if TARGET_IPHONE_SIMULATOR
    NSLog(@"-[%@ %@] - not supported in simulator", NSStringFromClass([self class]), NSStringFromSelector(_cmd));
    return @"TARGET_IPHONE_SIMULATOR";
#endif
    
#ifdef __IPHONE_8_0
    if (&kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly != NULL) {
        
        static NSData *password = nil;
        static dispatch_once_t onceToken;
        dispatch_once(&onceToken, ^{
            password = [NSKeyedArchiver archivedDataWithRootObject:NSStringFromSelector(_cmd)];
        });
        
        NSDictionary *query = @{
            (__bridge id)kSecClass: (__bridge id)kSecClassGenericPassword,
            (__bridge id)kSecAttrService: UIDevicePasscodeKeychainService,
            (__bridge id)kSecAttrAccount: UIDevicePasscodeKeychainAccount,
            (__bridge id)kSecReturnData: @YES,
        };
        
        CFErrorRef sacError = NULL;
        SecAccessControlRef sacObject;
        sacObject = SecAccessControlCreateWithFlags(kCFAllocatorDefault, kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly, kNilOptions, &sacError);
        
        // unable to create the access control item.
        if (sacObject == NULL || sacError != NULL) {
            return @"LNPasscodeStatusUnknown2";
        }
        
        
        NSMutableDictionary *setQuery = [query mutableCopy];
        [setQuery setObject:password forKey:(__bridge id)kSecValueData];
        [setQuery setObject:(__bridge id)sacObject forKey:(__bridge id)kSecAttrAccessControl];
        
        OSStatus status;
        status = SecItemAdd((__bridge CFDictionaryRef)setQuery, NULL);

        NSString *message1 = (NSString *)CFBridgingRelease(SecCopyErrorMessageString(status, NULL)) ?: @"Unknown error message";
        //NSString *status1 = NSStringFromOSStatus(status);
        
        // if it failed to add the item.
        if (status == errSecDecode) {
            return @"LNPasscodeStatusDisabled";
        }
        
        status = SecItemCopyMatching((__bridge CFDictionaryRef)query, NULL);
        
        NSString *message2 = (NSString *)CFBridgingRelease(SecCopyErrorMessageString(status, NULL)) ?: @"Unknown error message";

        //NSString *status2 = NSStringFromOSStatus(status);

        // it managed to retrieve data successfully
        if (status == errSecSuccess) {
            return @"LNPasscodeStatusEnabled";
        }
        
        NSString *resultstring = [NSString stringWithFormat:@"status: (%@), Status: (%@)",status2, status2];

        // not sure what happened, returning unknown
        return resultstring;
        
    } else {
        return @"LNPasscodeStatusUnknown4";
    }
#else
    return @"LNPasscodeStatusUnknown";
#endif
}
/*
NSString *NSStringFromOSStatus(OSStatus errCode)
{
    if (errCode == noErr)
        return @"noErr";
    char message[5] = {0};
    *(UInt32*) message = CFSwapInt32HostToBig(errCode);
    return [NSString stringWithCString:message encoding:NSASCIIStringEncoding];
}
*/
@end
