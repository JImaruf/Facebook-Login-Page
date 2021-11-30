package com.example.facebook.katana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Create_Account extends AppCompatActivity {

    Button submit;
    ArrayList<String> favourite= new ArrayList<>();
    RadioGroup radioGroup;
    RadioButton rbtn1,rbtn2,rbtn3;
    boolean ischecked ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);



        ActionBar actionBar= getSupportActionBar();
        actionBar.hide();
        radioGroup= findViewById(R.id.radidoGroup);
        rbtn1=findViewById(R.id.male);
        rbtn2= findViewById(R.id.female);
        rbtn3= findViewById(R.id.transgender);
       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               if(rbtn1.isChecked())
               {
                   Toast.makeText(Create_Account.this, rbtn1.getText().toString()+"", Toast.LENGTH_SHORT).show();
               }
               else if(rbtn2.isChecked())
               {
                   Toast.makeText(Create_Account.this, rbtn2.getText().toString()+"", Toast.LENGTH_SHORT).show();
               }
               else if(rbtn3.isChecked())
               {
                   Toast.makeText(Create_Account.this, rbtn3.getText().toString()+"", Toast.LENGTH_SHORT).show();
               }

           }
       });


      submit=findViewById(R.id.submit);
      submit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Toast.makeText(Create_Account.this, "Successful.Please wait for confirmation", Toast.LENGTH_SHORT).show();
          }
      });



    }

    public void checkBox(View view) {
        ischecked = ((CheckBox) view).isChecked();
        if (ischecked) {
            switch (view.getId()) {
                case R.id.movie:
                    favourite.add(((CheckBox) view).getText().toString());
                    update();
                    break;

                case R.id.songs:
                    favourite.add(((CheckBox) view).getText().toString());
                    update();
                    break;

                case R.id.sports:
                    favourite.add(((CheckBox) view).getText().toString());
                    update();
                    break;
                case R.id.entertainment:
                    favourite.add(((CheckBox) view).getText().toString());
                    update();
                    break;
                case R.id.video_games:
                    favourite.add(((CheckBox) view).getText().toString());
                    update();
                    break;
                case R.id.news:
                    favourite.add(((CheckBox) view).getText().toString());
                    update();



            }

        }

        else
        {
            int index = favourite.indexOf((((CheckBox) view).getText().toString()));
            favourite.remove(index);
            update();
        }
    }

    public void update()
    {
        Toast.makeText(Create_Account.this, favourite+"", Toast.LENGTH_SHORT).show();
    }
}