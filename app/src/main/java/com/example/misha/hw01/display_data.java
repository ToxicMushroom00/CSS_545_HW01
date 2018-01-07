package com.example.misha.hw01;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class display_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_data);
        Button btn_back = (Button) findViewById(R.id.btn_back);
        EditText txt_name = (EditText) findViewById(R.id.txt_name);
        EditText txt_email = (EditText) findViewById(R.id.txt_email);
        final Intent nextActivity = new Intent(this, MainActivity.class);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nextActivity.putExtra("name", txt_name.text);
                startActivity(nextActivity);
            }
        });

    }

}
