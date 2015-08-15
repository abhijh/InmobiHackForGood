package com.example.aramesh.hipc_trial;

/**
 * Created by aramesh on 15/08/15.
 */


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AdminActivity extends Activity {

    // Declare Variable
    Button logout,back_btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.admin_screen);

        // Retrieve current user from Parse.com
        // ParseUser currentUser = ParseUser.getCurrentUser();

        // Convert currentUser into String
        //String struser = currentUser.getUsername().toString();

        // Locate TextView in welcome.xml
//        TextView txtuser = (TextView) findViewById(R.id.txtuser);
//
//        // Set the currentUser String into TextView
//        txtuser.setText("You are logged in "); //as " + struser);
//
//        // Locate Button in welcome.xml
//        logout = (Button) findViewById(R.id.logout);

        //Locate Back Button
        back_btn = (Button)findViewById(R.id.backbtn);

        // Back Button Click Listener

        back_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        // Logout Button Click Listener
//        logout.setOnClickListener(new OnClickListener() {
//
//            public void onClick(View arg0) {
//                // Logout current user
//                //  ParseUser.logOut();
//                finish();
//            }
//        });
    }
}