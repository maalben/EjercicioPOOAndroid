package com.example.ejerciciopooandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejerciciopooandroid.clases.matematicas.OperadoresLogica;

public class MainActivity extends Activity {
    OperadoresLogica operadoresLogica = new OperadoresLogica();
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button calcularSuma;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.txtnumero1);
        valor2 = findViewById(R.id.txtnumero2);
        resultado = findViewById(R.id.lblresultado);
        calcularSuma = findViewById(R.id.btnsumar);

        calcularSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadoresLogica.setValor1(Double.parseDouble(valor1.getText().toString()));
                operadoresLogica.setValor2(Double.parseDouble(valor2.getText().toString()));
                resultado.setText(String.valueOf(operadoresLogica.sumar()));
                resultado.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, String.valueOf(operadoresLogica.sumar()), Toast.LENGTH_LONG).show();
            }
        });

    }
}
