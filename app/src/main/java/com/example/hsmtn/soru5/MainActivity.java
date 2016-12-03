package com.example.hsmtn.soru5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    Button b1,b2,b3,b4,b5;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        t=(TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String son="";
                if(!s1.isEmpty() && !s2.isEmpty()){
                    son= Integer.parseInt(s1)+ Integer.parseInt(s2) + "";
                    t.setText(son);
                }else {
                    Toast.makeText(getApplicationContext(),"lütfen tüm değerleri doldurunuz",Toast.LENGTH_SHORT).show();
                }

            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String son="";
                if(!s1.isEmpty() && !s2.isEmpty()){
                    son= (Integer.parseInt(s1) - Integer.parseInt(s2)) + "";
                    t.setText(son);
                }else {
                    Toast.makeText(getApplicationContext(),"lütfen tüm değerleri doldurunuz",Toast.LENGTH_SHORT).show();
                }

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String son="";
                if(!s1.isEmpty() && !s2.isEmpty()){
                    son= (Integer.parseInt(s1)* Integer.parseInt(s2)) + "";
                    t.setText(son);
                }else {
                    Toast.makeText(getApplicationContext(),"lütfen tüm değerleri doldurunuz",Toast.LENGTH_SHORT).show();
                }

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String son="";
                if(!s1.isEmpty() && !s2.isEmpty()){
                    if(Integer.parseInt(s2) != 0){
                    son= (Integer.parseInt(s1)/ Integer.parseInt(s2)) + "";
                    t.setText(son);
                    }else {
                        Toast.makeText(getApplicationContext(),"sayılar sıfıra bölünemez",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"lütfen tüm değerleri doldurunuz",Toast.LENGTH_SHORT).show();
                }

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String son="";
                if(!s1.isEmpty() && !s2.isEmpty()){
                    if(Integer.parseInt(s2) != 0){
                        son= (Integer.parseInt(s1)% Integer.parseInt(s2)) + "";
                        t.setText(son);
                    }else {
                        Toast.makeText(getApplicationContext(),"sayıların sıfıra modu alınamaz",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"lütfen tüm değerleri doldurunuz",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
