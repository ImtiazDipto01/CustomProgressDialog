package com.example.dipto.customprogressdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.open_dialog) ;

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SpotsDialog.Builder()
                    .setContext(MainActivity.this)
                    .setMessage("Custom Progress Dialog")
                    .build()
                    .show();
            }
        });
    }
}
