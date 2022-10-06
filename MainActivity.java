package com.example.s9q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,pwd;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText) findViewById(R.id.editText);
        pwd=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),MainActivity2.class);

                String st="";

                String res=email.getText().toString();
                String res2=pwd.getText().toString();

                if(res.equals("ABC")&&res2.equals("1131"))
                    st = ("LOGIN SUCCESSFUL");
                else
                    st = ("LOGIN FAILED");

                i.putExtra("st",st);

                startActivity(i);
            }
        });
    }
}