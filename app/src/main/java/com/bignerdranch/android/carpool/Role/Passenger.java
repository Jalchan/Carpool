package com.bignerdranch.android.carpool.Role;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bignerdranch.android.carpool.R;
import com.bignerdranch.android.carpool.login.helper.SQLiteHandler;
import com.bignerdranch.android.carpool.login.helper.SessionManager;

import java.util.HashMap;

/**
 * Created by Jal on 11/24/15.
 */
public class Passenger extends AppCompatActivity {
    private TextView thank;
    private TextView sending;
    private TextView txtName;
    private TextView driverEmail;
    private TextView instruction;
    private SQLiteHandler db;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger);

        thank = (TextView) findViewById(R.id.thank);
        sending = (TextView) findViewById(R.id.sending);
        txtName = (TextView) findViewById(R.id.name);
        driverEmail = (TextView) findViewById(R.id.driverEmail);
        instruction = (TextView) findViewById(R.id.instruction);

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
