package com.bk.binpacking;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    LinearLayout container;
    TextInputLayout[] textInputLayouts;
    EditText[] et;
    int[] inputs;
    int n,capacity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        container=(LinearLayout)findViewById(R.id.container);
        n = Integer.parseInt(getIntent().getExtras().getString("number"));
        capacity=Integer.parseInt(getIntent().getExtras().getString("capacity"));
        inputs=new int[n];
        textInputLayouts =new TextInputLayout[n];
        et=new EditText[n];
        for (int i=0;i<n;i++){
            textInputLayouts[i]=new TextInputLayout(this);
            textInputLayouts[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
            et[i]=new EditText(this);
            et[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
            et[i].setHint("weight "+(i+1)+" : ");
            et[i].setInputType(InputType.TYPE_CLASS_NUMBER);
            textInputLayouts[i].addView(et[i]);
            container.addView(textInputLayouts[i]);
        }
    }

    public void createBins(View view) {
        for (int i=0;i<n;i++){
            if (!et[i].getText().toString().equals("")){
            inputs[i]=Integer.parseInt(et[i].getText().toString());
            }
            else {
                inputs[i]=0;
                et[i].setText("0");
            }
        }
        Intent i=new Intent(this,RecView.class);
        i.putExtra("inputArray",inputs);
        i.putExtra("capacity",capacity);
        startActivity(i);
    }
}
