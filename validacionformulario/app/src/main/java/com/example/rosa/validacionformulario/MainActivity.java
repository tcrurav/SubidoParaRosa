package com.example.rosa.validacionformulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombre;
    EditText editTextEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        editTextEdad = (EditText) findViewById(R.id.editTextEdad);

        Button buttonValidar = (Button) findViewById(R.id.buttonValidar);
        buttonValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar();
            }
        });

    }

    private void validar() {
        editTextNombre.setError(null);
        editTextEdad.setError(null);

        String nombre = editTextNombre.getText().toString();
        String edadS = editTextEdad.getText().toString();

        if (TextUtils.isEmpty(nombre)) {
            editTextNombre.setError(getString(R.string.error_campo_obligatorio));
            editTextNombre.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(edadS)) {
            editTextEdad.setError(getString(R.string.error_campo_obligatorio));
            editTextEdad.requestFocus();
            return;
        }

        int edad = Integer.parseInt(edadS);
        if(edad <0 || edad > 99){
          editTextEdad.setError(getString(R.string.error_valor_entre_0_y_99));
          editTextEdad.requestFocus();
          return;
        }

        Toast.makeText(getApplicationContext(),"Se ha validado correctamente",Toast.LENGTH_SHORT);

    }
}
