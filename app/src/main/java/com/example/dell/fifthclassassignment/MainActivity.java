package com.example.dell.fifthclassassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button register;
EditText name,email,phone,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register=(Button)findViewById(R.id.registerBtn);
        name=(EditText)findViewById(R.id.nameET);
        email=(EditText) findViewById(R.id.emailET);
        phone=(EditText)findViewById(R.id.phoneET);
        password=(EditText) findViewById(R.id.passET);

        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);

    }
}
