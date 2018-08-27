package com.example.superviseur03.apptransport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btn_connect;
    Button btn_connect_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_connect=(Button) findViewById(R.id.btn_connect);
        btn_connect_email=(Button) findViewById(R.id.btn_connect_email);

      btn_connect_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

     btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,ConnectActivity.class);
                startActivity(intent);
            }
        });
    }
}
