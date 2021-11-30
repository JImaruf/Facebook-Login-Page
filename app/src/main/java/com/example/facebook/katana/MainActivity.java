package com.example.facebook.katana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    Button create;
    String eaddress,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        email=findViewById(R.id.Email);
        pass= findViewById(R.id.pass);



        create= findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Create_Account.class);
                startActivity(intent);
            }
        });
    }

    public void login(View view) {

        eaddress= email.getText().toString();
        password= pass.getText().toString();

        if(eaddress.equalsIgnoreCase("jimaruf1@gmail.com")&&password.equals("1234"))
        {
            Toast.makeText(this, "Log In Successful", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"Invalid Email OR Password",Toast.LENGTH_SHORT).show();
        }

    }
}