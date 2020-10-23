package com.bk.binpacking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText,et2;
    String n,capacity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.itemCount);
        et2=(EditText)findViewById(R.id.capacity);
    }

    public void go(View view) {
        n=editText.getText().toString();
        capacity=et2.getText().toString();
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("number",n);
        intent.putExtra("capacity",capacity);
        startActivity(intent);
    }
}
