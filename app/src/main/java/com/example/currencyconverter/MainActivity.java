package com.example.currencyconverter;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    TextInputEditText UsText , EgText;
    Button Convert,Clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsText=findViewById(R.id.USTEXT2);
        EgText=findViewById(R.id.EGTEXT);

        Convert=findViewById(R.id.CONVERT);
        Clear=findViewById(R.id.CLEAR);


        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Conversion number=new Conversion() ;

                if((!UsText.getText().toString().equals("")) && (EgText.getText().toString().equals("")))
                {
                    double num=Double.parseDouble(UsText.getText().toString());
                    number.setAmount(num);
                    num=number.UStoEG();
                    EgText.setText(String.valueOf(num));
                }

                 else if((UsText.getText().toString().equals("")) && (!EgText.getText().toString().equals("")))
                {
                    double num=Double.parseDouble(EgText.getText().toString());
                    number.setAmount(num);
                    num=number.EGtoUS();
                    UsText.setText(String.valueOf(num));
                }

                else if((!UsText.getText().toString().equals("")) && (!EgText.getText().toString().equals("")))
                {
                    Toast.makeText(getApplicationContext(),"Conversion already done!", Toast.LENGTH_LONG).show();
                }


                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid data - try again!", Toast.LENGTH_LONG).show();
                }


            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UsText.setText("") ;
                EgText.setText("");



            }
        });











    }
}

