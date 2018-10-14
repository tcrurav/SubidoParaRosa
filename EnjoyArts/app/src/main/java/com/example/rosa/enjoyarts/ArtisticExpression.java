package com.example.rosa.enjoyarts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ArtisticExpression extends Activity {


    TextView textView_hello;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView_selected;
    Button button_apply;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artistic_expression);

    //    showWelcome();

       radioGroup = findViewById(R.id.radioGroupAExpression);
        textView_selected = findViewById(R.id.textView_selected);

        Button buttonApply = findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                textView_selected.setText("Tu elección es: " + radioButton.getText());

                radioButton = findViewById(radioId);


            }
        });

        // TIBURCIO: Aquí recojo el parámetro pasado desde MainActivity y lo muestro por pantalla a modo de ejemplo
        String name = getIntent().getExtras().getString("name");
        Toast.makeText(this, "El mensaje pasado es: " + name, Toast.LENGTH_LONG).show();

    }


}

//código para pasar editText a textView en otra actividad, algo se me escapa porque no funciona aún probando en nuevo proyecto

/* v1
    private void showWelcome() {
        String name = getIntent().getExtras().getString("name");
        TextView textView_hello = (TextView) findViewById(R.id.editText_name);
        textView_hello.setText("¡" + "Hola" + name + "!");
    }

   */
//  ----------------
 /*  v2
        textView_hello = (TextView) findViewById(R.id.editText_name);
        String name = getIntent().getStringExtra("name");

        textView_hello.setText("name");

*/



