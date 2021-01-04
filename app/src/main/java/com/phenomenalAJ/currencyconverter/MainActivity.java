package com.phenomenalAJ.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public void btClick(View view){
       // ImageView igv = findViewById(R.id.iv1);
        EditText number1 = findViewById(R.id.num1);
        TextView tv1 = findViewById(R.id.tn1);  // US DOLLAR
        TextView tv2 = findViewById(R.id.tn2);  //European EURO
        TextView tv3 = findViewById(R.id.tn3);  //SWISS FRANC
        TextView tv4 = findViewById(R.id.tn4);  //ARGENTINA PESO
        TextView tv5 = findViewById(R.id.tn5);  //BRAZILIAN REAL
        TextView tv6 = findViewById(R.id.tn6);  //JAPANESE YEN
        TextView tv7 = findViewById(R.id.tn7);  //CHINESE YUAN
        double d = Double.parseDouble(number1.getText().toString());
        tv1.setText(String.format("%.2f", d / 74.01) + " US Dollars");
        tv2.setText(String.format("%.2f", d / 90.41)+ " European Euro");
        tv3.setText(String.format("%.2f", d / 83.43) + " Swiss Franc");
        tv4.setText(String.format("%.2f", d / 0.8943) + " Argentina Peso");
        tv5.setText(String.format("%.2f", d / 14.388) + " Brazilian Real");
        tv6.setText(String.format("%.2f", d / 0.71) + " Japanese Yen");
        tv7.setText(String.format("%.2f", d / 11.26) + " Chinese Yuan");
    }

}