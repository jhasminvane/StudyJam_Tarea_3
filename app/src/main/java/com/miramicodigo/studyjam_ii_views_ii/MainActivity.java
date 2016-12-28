package com.miramicodigo.studyjam_ii_views_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String res;
    private String res2;
    private int oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.tvResultado);
    }

    public void uno(View v){
        res = display.getText().toString();
        display.setText(res+"1");
    }
    public void dos(View v){
        res = display.getText().toString();
        display.setText(res+"2");
    }
    public void tres(View v){
        res = display.getText().toString();
        display.setText(res+"3");
    }
    public void cuatro(View v){
        res = display.getText().toString();
        display.setText(res+"4");
    }
    public void cinco(View v){
        res = display.getText().toString();
        display.setText(res+"5");
    }
    public void seis(View v){
        res = display.getText().toString();
        display.setText(res+"6");
    }
    public void siete(View v){
        res = display.getText().toString();
        display.setText(res+"7");
    }
    public void ocho(View v){
        res = display.getText().toString();
        display.setText(res+"8");
    }
    public void nueve(View v){
        res = display.getText().toString();
        display.setText(res+"9");
    }
    public void cero(View v){
        res = display.getText().toString();
        display.setText(res+"0");
    }
    public void punto(View v){
        res = display.getText().toString();
        display.setText(res+".");
    }


    public void sumar(View v){
        res2 = display.getText().toString();
        display.setText("0");
        oper=1;
    }
    public void restar(View v){
        res2 = display.getText().toString();
        display.setText("0");
        oper=2;
    }

    public void multiplicar(View v){
        res2 = display.getText().toString();
        display.setText("0");
        oper=3;
    }

    public void dividir(View v){
        res2 = display.getText().toString();
        display.setText("0");
        oper=4;
    }

    private double a;
    private double b;
    private double r;

    public void igual(View v){
        res = display.getText().toString();
        a=Double.parseDouble(res2);
        b=Double.parseDouble(res);
        if(oper==1) {
            r = a + b;
            display.setText("" + r);
        }
        if(oper==2) {
            r = a - b;
            display.setText("" + r);
        }
        if(oper==3) {
            r = a * b;
            display.setText("" + r);
        }
        if(oper==4) {
            r = a / b;
            display.setText("" + r);
        }
    }
    public void ce(View v){
        res="0";
        res2="0";
        display.setText("0");
    }

}
