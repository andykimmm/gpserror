# gpserror

E/AndroidRuntime: FATAL EXCEPTION: main
    Process: org.techtown.locationgps, PID: 7009
    java.lang.RuntimeException: Unable to instantiate service org.techtown.locationgps.RealService: java.lang.NullPointerException: Attempt to invoke virtual method 'int android.content.Context.checkPermission(java.lang.String, int, int)' on a null object reference
        at android.app.ActivityThread.handleCreateService(ActivityThread.java:4387)
        at android.app.ActivityThread.access$1800(ActivityThread.java:274)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2118)
        at android.os.Handler.dispatchMessage(Handler.java:107)
        at android.os.Looper.loop(Looper.java:237)
        at android.app.ActivityThread.main(ActivityThread.java:8167)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:496)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1100)
     Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'int android.content.Context.checkPermission(java.lang.String, int, int)' on a null object reference
        at android.content.ContextWrapper.checkPermission(ContextWrapper.java:776)
        at androidx.core.content.ContextCompat.checkSelfPermission(ContextCompat.java:538)
        at org.techtown.locationgps.RealService.startLocationService(RealService.java:106)
        at org.techtown.locationgps.RealService.<init>(RealService.java:65)
        at java.lang.Class.newInstance(Native Method)
        at android.app.AppComponentFactory.instantiateService(AppComponentFactory.java:129)
        at androidx.core.app.CoreComponentFactory.instantiateService(CoreComponentFactory.java:75)
        at android.app.ActivityThread.handleCreateService(ActivityThread.java:4382)
        at android.app.ActivityThread.access$1800(ActivityThread.java:274) 
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2118) 
        at android.os.Handler.dispatchMessage(Handler.java:107) 
        at android.os.Looper.loop(Looper.java:237) 
        at android.app.ActivityThread.main(ActivityThread.java:8167) 
        at java.lang.reflect.Method.invoke(Native Method) 
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:496) 
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1100) 
