package com.example.superviseur03.apptransport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button btn_connect;
    Button btn_compte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // button=(Button) findViewById(R.id.button);
       btn_connect=(Button) findViewById(R.id.btn_connect);

       btn_compte=(Button) findViewById(R.id.btn_compte);

       btn_compte.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent itent=new Intent(MainActivity.this,HomeActivity.class);
               startActivity(itent);
           }
       });

        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,ConnectActivity.class);
                startActivity(intent);
            }
        });
    }
}
