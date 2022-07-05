package org.techtown.locationgps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
//import org.techtown.locationgps.ProfileActivity

public class MainActivity extends AppCompatActivity {
    private Intent serviceIntent;

    TextView userName,userEmail,userId;
    private GoogleApiClient googleApiClient;
    private GoogleSignInOptions gso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEmail=(TextView)findViewById(R.id.email);

        PowerManager pm = (PowerManager) getApplicationContext().getSystemService(POWER_SERVICE);
        boolean isWhiteListing = false;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            isWhiteListing = pm.isIgnoringBatteryOptimizations(getApplicationContext().getPackageName());
        }
        if (!isWhiteListing) {
            Intent intent = new Intent();
            intent.setAction(android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
            intent.setData(Uri.parse("package:" + getApplicationContext().getPackageName()));
            startActivity(intent);
        }

        if (RealService.serviceIntent==null) {
            serviceIntent = new Intent(this, RealService.class);
            startService(serviceIntent);
        } else {
            serviceIntent = RealService.serviceIntent;//getInstance().getApplication();
            Toast.makeText(getApplicationContext(), "already", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (serviceIntent!=null) {
            stopService(serviceIntent);
            serviceIntent = null;
        }
    }
}
