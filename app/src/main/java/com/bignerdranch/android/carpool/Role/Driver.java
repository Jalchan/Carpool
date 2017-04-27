package com.bignerdranch.android.carpool.Role;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


import com.bignerdranch.android.carpool.R;
import com.bignerdranch.android.carpool.login.helper.SQLiteHandler;
import com.bignerdranch.android.carpool.login.helper.SessionManager;

import java.util.HashMap;


/**
 * Created by Jal on 11/23/15.
 */
public class Driver extends AppCompatActivity {
    private TextView thank;
    private TextView checking;
    private TextView txtName;
    private SQLiteHandler db;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        thank = (TextView) findViewById(R.id.thank);
        checking = (TextView) findViewById(R.id.checking);
        txtName = (TextView) findViewById(R.id.name);
        // SqLite database handler
        db = new SQLiteHandler(getApplicationContext());

        // session manager
        session = new SessionManager(getApplicationContext());


        // Fetching user details from sqlite
        HashMap<String, String> user = db.getUserDetails();

        String name = user.get("name");

        // Displaying the user details on the screen
        txtName.setText(name);


        }
}
