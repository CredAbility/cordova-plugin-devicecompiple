var exec = require('cordova/exec');

exports.coolMethod = function (success, error) {
    exec(success, error, 'devicecompile', 'checkDevice', null);
};
