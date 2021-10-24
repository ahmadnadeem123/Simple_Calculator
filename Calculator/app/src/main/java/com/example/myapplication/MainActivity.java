package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btnequal,btnclear;
    EditText ed1;
    boolean ADD,SUB,MUL,DIV;
    double num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnadd=(Button)findViewById(R.id.add);
        btnsub=(Button)findViewById(R.id.sub);
        btnmul=(Button)findViewById(R.id.mul);
        btndiv=(Button)findViewById(R.id.div);
        btnequal=(Button)findViewById(R.id.equal);
        btnclear=(Button)findViewById(R.id.clear);
        
        ed1=(EditText)findViewById(R.id.text1);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");

            }
        });
        
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
                
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");

            }
        });
        
        
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1!=null)
                {
                    num1=Double.parseDouble(ed1.getText() +"");
                    ADD=true;
                    ed1.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1!=null)
                {
                    num1=Double.parseDouble(ed1.getText() +"");
                    SUB=true;
                    ed1.setText(null);
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1!=null)
                {
                    num1=Double.parseDouble(ed1.getText() +"");
                    MUL=true;
                    ed1.setText(null);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1!=null)
                {
                    num1=Double.parseDouble(ed1.getText() +"");
                    DIV=true;
                    ed1.setText(null);
                }
            }
        });
        
        
        btnclear.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        }));
        
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Double.parseDouble(ed1.getText() + "");
                if(ADD==true)
                {
                    ed1.setText(num1 + num2 + "");
                    ADD=false;
                }
                else if(SUB==true)
                {
                    ed1.setText(num1 - num2 + "");
                    SUB=false;
                }
                else if(MUL==true)
                {
                    ed1.setText(num1 * num2 + "");
                    MUL=false;
                }
                else if(DIV==true)
                {
                    ed1.setText(num1 / num2 + "");
                    DIV=false;
                }
                
            }
        });
        
    }
}