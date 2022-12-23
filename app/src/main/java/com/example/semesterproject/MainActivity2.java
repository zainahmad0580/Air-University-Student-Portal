package com.example.semesterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and 123

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("123"))
                {
                    //correct
                    Toast.makeText(MainActivity2.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    OpenMainActivity();
                }
                else
                    //incorrect
                    Toast.makeText(MainActivity2.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void OpenMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}