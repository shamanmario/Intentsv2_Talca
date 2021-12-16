package com.example.intentsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView numero1, numero2, numero3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        numero3 = findViewById(R.id.numero3);

    }

    public void CrearBoleto(View view){
        int n1 = Integer.parseInt(numero1.getText().toString());
        int n2 = Integer.parseInt(numero2.getText().toString());
        int n3 = Integer.parseInt(numero3.getText().toString());

        Boleto boletoNuevo = new Boleto(n1, n2, n3);

        Intent resultado = new Intent();

        resultado.putExtra("boleto", boletoNuevo);

        setResult(RESULT_OK, resultado);

        finish();
    }
}