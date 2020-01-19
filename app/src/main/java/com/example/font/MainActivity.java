package com.example.font;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    TextView txt;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       txt= (TextView) findViewById(R.id.autoResizeEditText);
       btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);

        btn7=findViewById(R.id.button7);

        btn8=findViewById(R.id.button8);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);


    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                txt.setTextColor(Color.parseColor("#CCFF99"));
                break;
            case R.id.button2:
                txt.setTextColor(Color.parseColor("#FFFF00"));
                break;
            case R.id.button3:
                txt.setTextColor(Color.parseColor("#660066"));
                break;
            case R.id.button4:
                txt.setTextColor(Color.parseColor("#17BCE5"));
                break;
            case R.id.button5:
                txt.setTextColor(Color.parseColor("#FF3333"));
                break;
            case R.id.button6:
                txt.setTextColor(Color.parseColor("#B081EE"));
                break;

            case R.id.button7:
                txt.setTextColor(Color.parseColor("#151214"));
                break;
            case R.id.button8:
                txt.setTextColor(Color.parseColor("#FFFFFF"));
                break;
        }
    }
}
