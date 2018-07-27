package com.example.scitmaster.michelanwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    EditText searchBar;
    Button search;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn=findViewById(R.id.loginBtn);
        searchBar=findViewById(R.id.searchBar);
        search=findViewById(R.id.search);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);

    }

    public void loginPage(View view){

        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

}
