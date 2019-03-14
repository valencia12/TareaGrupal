package com.example.uca.tareagrupal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botonEntrada;
    private Button botonSalida;
    private TextView entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEntrada = findViewById(R.id.botonEntrada);
        botonSalida = findViewById(R.id.botonSalida);

        entrada = findViewById(R.id.contadorEntrada);
        salida = findViewById(R.id.contadorSalida);

        botonEntrada.setOnClickListener( v -> {
            contar(entrada);
        });

        botonSalida.setOnClickListener(v -> {
            contar(salida);
        });
    }

    public void contar(TextView textView){
        int contador;
        entrada = findViewById(R.id.contadorEntrada);
        contador = Integer.parseInt(textView.getText().toString());
        contador++;
        textView.setText(Integer.toString(contador));
    }

}