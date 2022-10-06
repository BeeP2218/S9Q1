package com.example.s9q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t3=(TextView) findViewById(R.id.textView3);

        Intent i= getIntent();

        String res=i.getStringExtra("st");
        t3.setText(res);
    }
}