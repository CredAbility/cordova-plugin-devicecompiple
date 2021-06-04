package cordova.plugin.devicecompile;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.Exception;
import java.io.File;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Object;
import java.io.IOException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.pm.PackageManager;
import android.os.Build;
 
public class devicecompile extends CordovaPlugin {
 
	CordovaInterface cordova;
    CordovaWebView view;
 
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        this.cordova = cordova;
        this.view = webView;
        chkDvc();
    }
 
    @Override
    public void onResume(boolean multiTasking) {
        chkDvc();
    }
 
    private void chkDvc() {
        boolean _IsDrived = IsDrived();
        boolean _isPasscodeSet = chkDvcVolt(this.cordova.getActivity());
 
        if (_IsDrived || !_isPasscodeSet) {
            View v = this.view.getView();
            if (v != null) {
                ViewGroup viewParent = (ViewGroup) v.getParent();
                if (viewParent != null) {
                    viewParent.removeView(v);
                }
            }
            Application app = cordova.getActivity().getApplication();
            String package_name = app.getPackageName();
            Resources resources = app.getResources();
            String message = resources.getString(resources.getIdentifier("message","string", package_name));
            String label = resources.getString(resources.getIdentifier("label","string", package_name));
            this.alert(message, label);
        }
    }
 
    public boolean IsDrived() {
        return CompileDrive1() || CompileDrive2() || CompileDrive3() || CompileDrive4() || CompileDrive5() || CompileDrive7() || CompileDrive8() || CompileDrive9() || CompileDrive10() || CompileDrive11() || CompileDrive12() || CompileDrive13();
    }
 
    private static boolean CompileDrive1() {
        String cmpltyp   = new StringBuilder("t").append("es").append("t-ke").append("ys").toString();
        String buildTags = android.os.Build.TAGS;
        return buildTags != null && buildTags.contains(cmpltyp);
    }
 
    private static boolean CompileDrive2() {
        String cmpltyp1 = new StringBuilder("/").append("sy").append("ste").append("m/a").append("pp/S").append("upe").append("rus").append("er.a").append("pk").toString();
        String cmpltyp2 = new StringBuilder("/").append("sy").append("ste").append("m/a").append("pp/S").append("upe").append("rS").append("U.a").append("pk").toString();
        String cmpltyp3 = new StringBuilder("/").append("sb").append("in/s").append("u").toString();
        String cmpltyp4 = new StringBuilder("/").append("sy").append("ste").append("m/b").append("in/s").append("u").toString();
        String cmpltyp5 = new StringBuilder("/").append("sy").append("ste").append("mx/b").append("in/s").append("u").toString();
        String cmpltyp6 =new StringBuilder("/").append("sy").append("ste").append("m/s").append("dx/b").append("in/s").append("u").toString();
        String cmpltyp7 = new StringBuilder("/").append("d").append("a/t").append("a/l").append("oca").append("lx/b").append("in/s").append("u").toString();
        String cmpltyp8 = new StringBuilder("/").append("d").append("a/t").append("a/l").append("oca").append("l/b").append("in/s").append("u").toString();
        String cmpltyp9 = new StringBuilder("/").append("d").append("a/t").append("a/l").append("oca").append("l/s").append("u").toString();
        String cmpltyp10 = new StringBuilder("/").append("s").append("ub").append("in/s").append("u").toString();
        String cmpltyp11 = new StringBuilder("/").append("sy").append("ste").append("m/b").append("in/f").append("ai").append("lsa").append("fe/s").append("u").toString();
        String[] paths = { cmpltyp1, cmpltyp2, cmpltyp3, cmpltyp4, cmpltyp5, cmpltyp6, cmpltyp7, cmpltyp8, cmpltyp9, cmpltyp10, cmpltyp11};
        for (String path : paths) {
            if (new File(path).exists()) return true;
        }
        return false;
    }
 
    private static boolean CompileDrive3() {
        Process process = null;
        String cmpltyp12 = new StringBuilder("/").append("sy").append("ste").append("m/xb").append("in/w").append("hi").append("ch").toString();
        String cmpltyp13 = new StringBuilder("s").append("u").toString();
        try {
            process = Runtime.getRuntime().exec(new String[] { cmpltyp12, cmpltyp13 });
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            if (in.readLine() != null) return true;
            return false;
        } catch (Throwable t) {
            return false;
        } finally {
            if (process != null) process.destroy();
        }
    }
 
    public boolean CompileDrive4() {
        return CompileDrive4(null);
    }
 
 
    public boolean CompileDrive4(String[] adnRtMngPkg) {
 
 
        ArrayList<String> packages = new ArrayList<>();
        String rtpkg1 = new StringBuilder("co").append("m.no").append("sh").append("ufo").append("u.an").append("dro").append("id.s").append("u").toString();
        String rtpkg2 = new StringBuilder("co").append("m.no").append("sh").append("ufo").append("u.an").append("dro").append("id.s").append("u.el").append("ite").toString();
        String rtpkg3 = new StringBuilder("eu.c").append("hai").append("nfi").append("re.s").append("up").append("er").append("s").append("u").toString();
        String rtpkg4 = new StringBuilder("co").append("m.ko").append("ush").append("ikd").append("ut").append("ta.s").append("up").append("eru").append("ser").toString();
        String rtpkg5 = new StringBuilder("co").append("m.th").append("ird").append("pa").append("rty.s").append("up").append("eru").append("ser").toString();
        String rtpkg6 = new StringBuilder("co").append("m.ye").append("llo").append("wes.s").append("u").toString();
        String rtpkg7 = new StringBuilder("co").append("m.za").append("chs").append("po").append("ng.te").append("mpr").append("ootr").append("emo").append("ve").append("jb").toString();
        String rtpkg8 = new StringBuilder("co").append("m.ra").append("mdro").append("id.a").append("ppq").append("uar").append("ant").append("ine").toString();
      
        String[] knwRtPkg = { rtpkg1, rtpkg2, rtpkg3, rtpkg4, rtpkg5, rtpkg6, rtpkg7, rtpkg8};
         
        packages.addAll(Arrays.asList(knwRtPkg));
        if (adnRtMngPkg!=null && adnRtMngPkg.length>0){
            packages.addAll(Arrays.asList(adnRtMngPkg));
        }
 
        return IsPkgFrmLsIns(packages);
    }
 
 
    public boolean CompileDrive5() {
        return CompileDrive5(null);
    }
 
    public boolean CompileDrive5(String[] adnDngAp) {
 
 
        ArrayList<String> packages = new ArrayList<>();
                               
        String dngpkg1 = new StringBuilder("co").append("m.ko").append("ush").append("ikd").append("ut").append("ta.ro").append("mma").append("nag").append("er").toString();
        String dngpkg2 = new StringBuilder("co").append("m.ko").append("ush").append("ikd").append("ut").append("ta.ro").append("mma").append("nag").append("er.li").append("cen").append("se").toString();
        String dngpkg3 = new StringBuilder("co").append("m.di").append("monv").append("ide").append("o.lu").append("ckyp").append("atc").append("her").toString();
        String dngpkg4 = new StringBuilder("co").append("m.ch").append("elp").append("us.la").append("ckyp").append("atc").append("h").toString();
        String dngpkg5 = new StringBuilder("co").append("m.ra").append("mdro").append("id.a").append("ppq").append("uar").append("ant").append("ine").toString();
        String dngpkg6 = new StringBuilder("co").append("m.ra").append("mdro").append("id.a").append("ppq").append("uar").append("ant").append("in").append("ep").append("ro").toString();
 
        String[] knwDngPkg = { dngpkg1,dngpkg2,dngpkg3,dngpkg4,dngpkg5,dngpkg6};
                               
        packages.addAll(Arrays.asList(knwDngPkg));
        if (adnDngAp!=null && adnDngAp.length>0){
            packages.addAll(Arrays.asList(adnDngAp));
        }
 
        return IsPkgFrmLsIns(packages);
    }
 
    private static String[] propsReader() {
        InputStream inputstream = null;
                               
        String lclVar1 = new StringBuilder("ge").append("tpr").append("op").toString();                 
                               
        try {
            inputstream = Runtime.getRuntime().exec(lclVar1).getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String propval = "";
        try {
            propval = new Scanner(inputstream).useDelimiter("\\A").next();
 
        } catch (NoSuchElementException e) {
 
        }
 
        return propval.split("\n");
    }
 
    private static String[] mountReader() {
        InputStream inputstream = null;
 
        String lclVar2 = new StringBuilder("mo").append("u").append("nt").toString();   
 
        try {
            inputstream = Runtime.getRuntime().exec(lclVar2).getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 
        if (inputstream == null) return null;
 
        String propval = "";
        try {
            propval = new Scanner(inputstream).useDelimiter("\\A").next();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
 
        return propval.split("\n");
    }
 
    private boolean IsPkgFrmLsIns(List<String> packages){
        boolean result = false;
		CordovaInterface cordova = this.cordova;
		try {
			PackageManager pm = cordova.getActivity().getApplicationContext().getPackageManager();
	 
			for (String packageName : packages) {
				try {
					pm.getPackageInfo(packageName, 0);
					result = true;
				} catch (PackageManager.NameNotFoundException e) {
	 
				}
			} 
		} catch (Exception e) {}
 
        return result;
    }

    public static boolean CompileDrive6(String filename) {
                               
        String spth1 = new StringBuilder("/").append("d").append("ata/l").append("oca").append("l/").toString();
        String spth2 = new StringBuilder("/").append("d").append("ata/l").append("oca").append("l/b").append("in/").toString();
        String spth3 = new StringBuilder("/").append("d").append("ata/l").append("oca").append("l/xb").append("in/").toString();
        String spth4 = new StringBuilder("/").append("s").append("b").append("in/").toString();
        String spth5 = new StringBuilder("/").append("s").append("u/b").append("in/").toString();
        String spth6 = new StringBuilder("/").append("s").append("yst").append("em/b").append("in/").toString();
        String spth7 = new StringBuilder("/").append("s").append("yst").append("em/b").append("in/.e").append("xt/").toString();
        String spth8 = new StringBuilder("/").append("s").append("yst").append("em/b").append("in/fa").append("ils").append("afe/").toString();
        String spth9 = new StringBuilder("/").append("s").append("yst").append("em/s").append("d/xb").append("in/").toString();
        String spth10 = new StringBuilder("/").append("s").append("yst").append("em/us").append("r/w").append("-ene").append("ed-r").append("oot/").toString();
        String spth11 = new StringBuilder("/").append("s").append("yst").append("em/xb").append("in/").toString();
 
        String[] spthPaths = { spth1,spth2,spth3,spth4,spth5,spth6,spth7,spth8,spth9,spth10,spth11};    
 
        String[] pathsArray = spthPaths;
 
        boolean result = false;
 
        for (String path : pathsArray) {
            String completePath = path + filename;
            File f = new File(completePath);
            boolean fileExists = f.exists();
            if (fileExists) {
                result = true;
            }
        }
 
        return result;
    }
 
    public static boolean CompileDrive7() {
 
        final Map<String, String> dangerousProps = new HashMap<>();
        dangerousProps.put("ro.debuggable", "1");
        dangerousProps.put("ro.secure", "0");
 
        boolean result = false;
 
        String[] lines = propsReader();
        for (String line : lines) {
            for (String key : dangerousProps.keySet()) {
                if (line.contains(key)) {
                    String badValue = dangerousProps.get(key);
                    badValue = "[" + badValue + "]";
                    if (line.contains(badValue)) {
                        result = true;
                   }
                }
            }
        }
        return result;
    }
 
    public static boolean CompileDrive8() {
 
        boolean result = false;
 
        String[] lines = mountReader();
        for (String line : lines) {
            String[] args = line.split(" ");
 
            if (args.length < 4){
                continue;
            }
 
            String mountPoint = args[1];
            String mountOptions = args[3];
                                               
			String sdnwr1 = new StringBuilder("/").append("s").append("yst").append("em").toString();
			String sdnwr2 = new StringBuilder("/").append("s").append("yst").append("em/b").append("in").toString();
			String sdnwr3 = new StringBuilder("/").append("s").append("yst").append("em/sb").append("in").toString();
			String sdnwr4 = new StringBuilder("/").append("s").append("yst").append("em/xb").append("in").toString();
			String sdnwr5 = new StringBuilder("/").append("v").append("end").append("or/b").append("in").toString();
			String sdnwr6 = new StringBuilder("/").append("s").append("b").append("in").toString();
			String sdnwr7 = new StringBuilder("/").append("e").append("tc").toString();
                                               
			String[] ptNotWri = { sdnwr1, sdnwr2, sdnwr3, sdnwr4, sdnwr5, sdnwr6, sdnwr7};	                                                               
 
            for(String pathToCheck: ptNotWri) {
                if (mountPoint.equalsIgnoreCase(pathToCheck)) {
                    for (String option : mountOptions.split(",")){
 
                        if (option.equalsIgnoreCase("rw")){
                            result = true;
                            break;
                        }
                    }
                }
            }
        }
 
        return result;
    }

    public static boolean CompileDrive9() {
        String buildTags = android.os.Build.TAGS;
        String buildFinger= Build.FINGERPRINT;
        String product=Build.PRODUCT;
        String hardware=Build.HARDWARE;
        String display=Build.DISPLAY;
        return (buildTags != null) && (buildTags.contains("test-keys")|| buildFinger.contains("genric.*test-keys")||product.contains("generic")||product.contains("sdk")||hardware.contains("goldfish")||display.contains(".*test-keys"));
    }
 
 
    public static boolean CompileDrive10() {
        Process process = null;
                               
        String lclVar3 = new StringBuilder("wh").append("ich").toString();
        String lclVar4 = new StringBuilder("s").append("u").toString();
                               
        try {
            process = Runtime.getRuntime().exec(new String[] { lclVar3, lclVar4 });
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return in.readLine() != null;
        } catch (Throwable t) {
            return false;
        } finally {
            if (process != null) process.destroy();
        }
    }
 
    public static boolean CompileDrive11(){
        String cmpDrPath1 = new StringBuilder("s").append("u").toString();
        return CompileDrive6(cmpDrPath1);
    }
 
 
    public static boolean CompileDrive12(){
        String cmpDrPath2 = new StringBuilder("bu").append("syb").append("ox").toString();
        return CompileDrive6(cmpDrPath2);
    }
 
     public boolean CompileDrive13() {
        return CompileDrive13(null);
    }
 
 
    public boolean CompileDrive13(String[] adnRtClkAp) {
 
 
        ArrayList<String> packages = new ArrayList<>();
                               
        String clkpkg1 = new StringBuilder("co").append("m.de").append("vad").append("van").append("ce.ro").append("otc").append("lo").append("ak").toString();
        String clkpkg2 = new StringBuilder("co").append("m.de").append("vad").append("van").append("ce.ro").append("otc").append("lo").append("akp").append("lus").toString();
        String clkpkg3 = new StringBuilder("de.r").append("obv.a").append("ndr").append("oid.x").append("pos").append("ed.i").append("nsta").append("ll").append("er").toString();
        String clkpkg4 = new StringBuilder("co").append("m.sa").append("uri").append("k.su").append("bstr").append("ate").toString();
        String clkpkg5 = new StringBuilder("co").append("m.za").append("chs").append("po").append("ng.te").append("mpr").append("ootr").append("emo").append("ve").append("jb").toString();
        String clkpkg6 = new StringBuilder("co").append("m.am").append("phor").append("as.h").append("idem").append("yr").append("oot").toString();
        String clkpkg7 = new StringBuilder("co").append("m.am").append("phor").append("as.h").append("idem").append("yr").append("oota").append("dfr").append("ee").toString();
        String clkpkg8 = new StringBuilder("co").append("m.fo").append("rmy").append("hm.h").append("ider").append("ootP").append("rem").append("ium").toString();
        String clkpkg9 = new StringBuilder("co").append("m.fo").append("rmy").append("hm.h").append("ider").append("oot").toString();
                               
        String[] knwRtClkPkg = { clkpkg1,clkpkg2,clkpkg3,clkpkg4,clkpkg5,clkpkg6,clkpkg7,clkpkg8,clkpkg9};                               
                               
        packages.addAll(Arrays.asList(knwRtClkPkg));
        if (adnRtClkAp!=null && adnRtClkAp.length>0){
            packages.addAll(Arrays.asList(adnRtClkAp));
        }
 
        return IsPkgFrmLsIns(packages);
    }

    public static boolean chkDvcVolt(Context context)
    {
        return chkDotConxn(context) || chkCharAlfaNum(context);
    }

    private static boolean chkDotConxn(Context context)
    {
        ContentResolver cr = context.getContentResolver();
        try
        {
            if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.M) {
                int lockPatternEnable = Settings.Secure.getInt(cr, Settings.Secure.LOCK_PATTERN_ENABLED);
                return lockPatternEnable == 1;
            } else {
                return false;
            }
        }
        catch (Settings.SettingNotFoundException e)
        {
 
            return false;
        }
    }

    @SuppressLint("NewApi")
    private static boolean chkCharAlfaNum(Context context)
    {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE); //api 16+
        return keyguardManager.isKeyguardSecure();
    }
    private synchronized void alert(final String message, final String buttonLabel) {
        final CordovaInterface cordova = this.cordova;
        final Activity activity = cordova.getActivity();
 
        Runnable runnable = new Runnable() {
            public void run() {
 
                AlertDialog.Builder dlg = createDialog(cordova);
                dlg.setMessage(message);
                dlg.setCancelable(true);
                dlg.setPositiveButton(buttonLabel,
                        new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                System.exit(0);
                            }
                        });
                dlg.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    public void onDismiss(final DialogInterface dialog) {
                        System.exit(0);
                    }
                });
                changeTextDirection(dlg);
            };
        };
        this.cordova.getActivity().runOnUiThread(runnable);
    }
 
    @SuppressLint("NewApi")
    private AlertDialog.Builder createDialog(CordovaInterface cordova) {
        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentapiVersion >= android.os.Build.VERSION_CODES.HONEYCOMB) {
            return new AlertDialog.Builder(cordova.getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
        } else {
            return new AlertDialog.Builder(cordova.getActivity());
        }
    }
 
    @SuppressLint("NewApi")
    private void changeTextDirection(Builder dlg){
        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        dlg.create();
        AlertDialog dialog =  dlg.show();
        if (currentapiVersion >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
            TextView messageview = (TextView)dialog.findViewById(android.R.id.message);
            messageview.setTextDirection(android.view.View.TEXT_DIRECTION_LOCALE);
        }
    }
}