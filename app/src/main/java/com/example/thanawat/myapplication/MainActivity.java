package com.example.thanawat.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    EditText edt;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text1);
        btn = (Button) findViewById(R.id.button);
        edt = (EditText)findViewById(R.id.plantText);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(edt.getText().toString());
                int duration = Toast.LENGTH_SHORT;
                Toast t = Toast.makeText(getApplication(), edt.getText().toString(), duration);
                        t.show();
            }
        });

    }
}
