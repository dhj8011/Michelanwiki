package com.example.scitmaster.michelanwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText idText=(EditText)findViewById(R.id.idText);
        EditText pwText=(EditText)findViewById(R.id.pwText);

        Button regBtn=(Button)findViewById(R.id.regBtn);
        Button loginBtn=(Button)findViewById(R.id.loginBtn);


    }

    public void mainPage(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void registerPage(View view){
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

}
