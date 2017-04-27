package com.bignerdranch.android.carpool.Role;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bignerdranch.android.carpool.R;
import com.bignerdranch.android.carpool.login.Activity.RegisterActivity;
import com.bignerdranch.android.carpool.login.app.AppConfig;
import com.bignerdranch.android.carpool.login.helper.SQLiteHandler;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Jal on 11/23/15.
 */
public class GetRole extends AppCompatActivity {
    private static final String TAG = RegisterActivity.class.getSimpleName();

    private Button btnDriver;
    private Button btnPassanger;
    private SQLiteHandler db;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getrole);





        btnDriver = (Button) findViewById(R.id.btnDriver);
        btnPassanger = (Button) findViewById(R.id.btnPassenger);

        //driver button event
        btnDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Driver.class);
                startActivity(intent1);
                String role = "driver";
            }
        }) ;
        //passenger button event
        btnPassanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Passenger.class);
                startActivity(intent2);
                String role = "passenger";
            }
        }) ;


    }


}