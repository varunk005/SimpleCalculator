package com.varun.dell.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bequal, badd, bminus, bmultiply, bdivide,sqrt,perc;
    double var1, var2, c;
    boolean add, sub, mul, div,sqr,per;
String data, pata;
AdView madview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        perc = findViewById(R.id.per);
        sqrt= findViewById(R.id.sqr);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);

        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);

        badd = findViewById(R.id.add);
        bminus = findViewById(R.id.minus);
        bmultiply = findViewById(R.id.multiply);
        bdivide = findViewById(R.id.divide);
        bequal = findViewById(R.id.equal);



        }

    public void onef(View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText()+"1");
        TextView dis =findViewById(R.id.view);
        dis.setText("1");

    }

    public void twof(View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "2");
        TextView dis =findViewById(R.id.view);
        dis.setText("2");
    }
    public void threef (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "3");
    }
    public void fourf (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "4");

    }
    public void dotf (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + ".");

    }
    public void fivef (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "5");
    }
    public void sixf (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "6");
    }
    public void sevenf (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "7");
    }
    public void eightf (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "8");
    }



    public void ninef (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "9");
    }
    public void zerof (View v){
        EditText resultview =findViewById(R.id.result);
        resultview.setText(resultview.getText() + "0");
    }
    public void clearf (View v){
        TextView dis =findViewById(R.id.view);
        EditText resultview =findViewById(R.id.result);
        resultview.getText().clear();
        dis.setText(null);
    }
    public void backspace (View v){
        EditText resultview =findViewById(R.id.result);
        String back = resultview.getText().toString();
        if(back.length()>=1) {
            back = back.substring(0, back.length() - 1);
            resultview.setText(back);
        }
            else if(back.length()<=1){
                resultview.setText("0");
            }
        }




        public void addf (View v ){
try{
        EditText resultview = findViewById(R.id.result);
        TextView dis = findViewById(R.id.view);
        data = resultview.getText().toString() + "+";
        var1 = Double.parseDouble(resultview.getText() + "");
        add = true;
        dis.setText(data);
        resultview.setText(null);
}
catch(Exception e) {
    TextView dis = findViewById(R.id.view);
    dis.setText(data);

}
    }



    public void percent(View v){
        try {
            EditText resultview = findViewById(R.id.result);
            var1 = Double.parseDouble(resultview.getText() + "");
            TextView dis = findViewById(R.id.view);

            c = var1 / 100;
            String ans = Double.toString(c);
            dis.setText("=" + ans);
            resultview.setText(c + "");
        }
        catch(Exception e) {
            TextView dis = findViewById(R.id.view);
            dis.setText("%");

        }

    }


    public void sqr (View v){
        try {
            EditText resultview = findViewById(R.id.result);

            var1 = Double.parseDouble(resultview.getText() + "");
            TextView dis = findViewById(R.id.view);


            c = Math.sqrt(var1);
            String ans = Double.toString(c);
            dis.setText("=" + ans);
            resultview.setText(c + "");
        }
        catch(Exception e) {
            TextView dis = findViewById(R.id.view);
            dis.setText("√");

        }

        }

    public void subf (View v){
        try {
            EditText resultview = findViewById(R.id.result);
            TextView dis = findViewById(R.id.view);
            data = resultview.getText().toString() + "-";
            var1 = Double.parseDouble(resultview.getText() + "");
            sub = true;
            dis.setText(data);
            resultview.setText(null);
        }
        catch(Exception e) {
            TextView dis = findViewById(R.id.view);
            dis.setText(data);

        }
    }
    public void mulf (View v){

        try {

            EditText resultview = findViewById(R.id.result);
            TextView dis = findViewById(R.id.view);
            data = resultview.getText().toString() + "*";
            var1 = Double.parseDouble(resultview.getText() + "");
            mul = true;

            dis.setText(data);
            resultview.setText(null);
        }
        catch(Exception e) {
            TextView dis = findViewById(R.id.view);
            dis.setText(data);

        }

    }
    public void divf (View v){
        try {
            EditText resultview = findViewById(R.id.result);
            TextView dis = findViewById(R.id.view);
            data = resultview.getText().toString() + "/";
            var1 = Double.parseDouble(resultview.getText() + "");
            div = true;
            dis.setText(data);
            resultview.setText(null);
        }
        catch(Exception e) {
            TextView dis = findViewById(R.id.view);
            dis.setText(data);

        }
    }

    public void equalf (View v) {
        try {
            TextView dis = findViewById(R.id.view);
            EditText resultview = findViewById(R.id.result);
            var2 = Double.parseDouble(resultview.getText() + "");
            pata = resultview.getText().toString();
            dis.setText(pata);


            if (add) {
                dis.setText("+");
                c = var1 + var2;
                String ans = Double.toString(c);
                dis.setText(data + pata + "=" + ans);
                resultview.setText(c + "");

                add = false;
            }
            if (sub) {
                c = var1 - var2;
                String ans = Double.toString(c);
                dis.setText(data + pata + "=" + ans);
                resultview.setText(var1 - var2 + "");
                sub = false;
            }
            if (mul) {
                c = var1 * var2;
                String ans = Double.toString(c);
                dis.setText(data + pata + "=" + ans);
                resultview.setText(c + "");
                mul = false;
            }
            if (div) {

                if (var2 == 0) {
                    dis.setText("nan");
                } else {
                    c = var1 / var2;
                    String ans = Double.toString(c);
                    dis.setText(data + pata + "=" + ans);
                    resultview.setText(c + "");

                }
                div = false;
            }


        }
        catch(Exception e) {
            TextView dis = findViewById(R.id.view);
            dis.setText("=");

        }

    }
    }


