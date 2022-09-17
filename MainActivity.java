package com.example.thegreatcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

int quant=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }

         public void incrementbyone(View view){
            quant=quant+1;
            display1(quant);
//            This is used when you want that just on increment it automatically update the price without pressing the calculate button
//             int amount=5;
//             display2(amount*quant);
    }

         public void decrement(View view){
            quant=quant-1;
            display1(quant);
//            int amount=5;
//            display2(amount*quant);
    }
    public void calculateTheAmount(View view){
        int amount=5;
        display2(quant*amount);
    }



    private void display1(int number){
        TextView textView6=(TextView) findViewById(R.id.textView6);
        textView6.setText(""+number);}

    private void display2(int number) {
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(NumberFormat.getCurrencyInstance().format(number));}



}



