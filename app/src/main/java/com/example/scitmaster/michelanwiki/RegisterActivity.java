package com.example.scitmaster.michelanwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final DBManager db=new DBManager(getApplicationContext(), "Member.db",null,1);

        final EditText idText=(EditText)findViewById(R.id.idText);
        final EditText pwText=(EditText)findViewById(R.id.pwText);
        final EditText nickName=(EditText)findViewById(R.id.nickName);

        Button regBtn=(Button)findViewById(R.id.regBtn);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Id = idText.getText().toString();
                String Nickname = nickName.getText().toString();
                String Password = pwText.getText().toString();

                db.insert("insert into Member_List (" +idText + "," + nickName + "," + pwText + ") values(" + Id + "," + Nickname + "," + Password + ");");

            }

        });
        Button cancelBtn=(Button)findViewById(R.id.cancelBtn);


    }
    public void mainPage(View view){

        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

}
