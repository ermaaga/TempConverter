package com.example.convertitoreditemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tempCelsius;
    TextView tempFar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rel);

        tempCelsius=(EditText)findViewById(R.id.etCelsius);
        tempFar = (TextView) findViewById(R.id.tvFahreneit);

    }

    public void Convert(View view) {


        Log.d("ConvertiTemperatura","Click sul button converti");
        // 1. Leggere la temperatura in Celsius
        String temperaturaCelsius = tempCelsius.getText().toString();
        Log.d("convertTemperatura","Temperatura celsius"+temperaturaCelsius);

        // 2. convertire la temperatrua espressa in celsius in double
        double tempC = Double.parseDouble(temperaturaCelsius);
        double tempF = tempC*1.8+32;

        //3. scrivere il valore di F nella text vie
        tempFar.setText(Double.toString(tempF));


    }
}
