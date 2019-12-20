package pro.userx.example;

import android.app.Application;

import pro.userx.UserX;

public class UserXApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UserX.init("YOUR_API_KEY");
    }
}
