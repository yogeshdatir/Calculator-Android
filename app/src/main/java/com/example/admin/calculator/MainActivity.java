package com.example.admin.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity  {
    private TextView t1,t2;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    private double val1,val2;
    private boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);

        b17=(Button)findViewById(R.id.button17);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"7");
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"8");
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"9");
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"4");
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"5");
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"6");
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"1");
            }
        });

        b10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"2");
            }
        });

        b11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"3");
            }
        });

        b13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+"4");
            }
        });
        b14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                t2.setText(t2.getText()+".");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(t2.getText()+"");
                add=true;
                t2.setText(null);
                t1.setText(val1+" + ");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(t2.getText()+"");
                sub=true;
                t2.setText(null);
                t1.setText(val1+" - ");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(t2.getText()+"");
                div=true;
                t2.setText(null);
                t1.setText(val1+" / ");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Double.parseDouble(t2.getText()+"");
                mul=true;
                t2.setText(null);
                t1.setText(val1+" x ");
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val2=Double.parseDouble(t2.getText()+"");
                if (add==true) {
                    t1.setText(val1+" + "+val2+" = ");
                    t2.setText(val1+val2+"");
                    add=false;
                }
                if (sub==true) {
                    t1.setText(val1+" - "+val2+" = ");
                    t2.setText(val1-val2+"");
                    sub=false;
                }
                if (mul==true) {
                    t1.setText(val1+" x "+val2+" = ");
                    t2.setText(val1*val2+"");
                    mul=false;
                }
                if (div==true) {
                    t1.setText(val1+" / "+val2+" = ");
                    t2.setText(val1/val2+"");
                    div=false;
                }
            }

        });
        b17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
             t1.setText("");
             t2.setText("");
            }
        });



    }


}
