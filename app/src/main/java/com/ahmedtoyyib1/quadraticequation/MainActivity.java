package com.ahmedtoyyib1.quadraticequation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view){
        //declared variabel
        EditText aNum = (EditText) findViewById(R.id.editText);
        EditText bNum = (EditText) findViewById(R.id.editText2);
        EditText cNum = (EditText) findViewById(R.id.editText3);

        TextView ans1 = (TextView) findViewById(R.id.x1);
        TextView ans2 = (TextView) findViewById(R.id.x2);
        //TextView text3 = (TextView) findViewById(R.id.textview3);

        //input
        int a = Integer.parseInt(aNum.getText().toString());
        int b = Integer.parseInt(bNum.getText().toString());
        int c = Integer.parseInt(cNum.getText().toString());

        //  process solution
        double discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0) {
            //
            ans1.setText("Sorry, both roots are complex numbers.");
            ans2.setText("I can not solve that quadratic equation.");
            return;
        }else{
            double rootDiscriminant = Math.sqrt(discriminant);
            Double x1 = (-b + rootDiscriminant) / (2 * a);
            Double x2 = (-b - rootDiscriminant) / (2 * a);
            //output solution
            ans1.setText("x1 = " +  Double.toString(x1));
            if (x1 != x2) ans2.setText("x2 = " +  Double.toString(x2));
            else ans2.setText("Only one root.");

        }


    }


}
