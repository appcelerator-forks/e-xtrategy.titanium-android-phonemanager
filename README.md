titanium-android-phonemanager
=============================

Native android module to expose phone status change events.

Usage:
------

    var phonemanager = require('it.extrategy.phonemanager');
    phonemanager.addEventListener('phone_status_change', function(e) {
        if (e.status == 'ringing') {
            doSomething();
        }
    });
    phonemanager.init();
