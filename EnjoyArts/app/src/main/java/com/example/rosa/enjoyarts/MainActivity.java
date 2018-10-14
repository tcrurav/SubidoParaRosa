package com.example.rosa.enjoyarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //private EditText editText_name;
    //private Button button_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ejecutar_buttonStart (View view){
        EditText editText_name = (EditText) findViewById(R.id.editText_name);
        String name = editText_name.getText().toString();

        // TIBURCIO: Aquí empieza la validación

        editText_name.setError(null);
        if(TextUtils.isEmpty(name)){
            editText_name.setError("Está vacío");
            editText_name.setFocusable(true);
            return;
        }

        // TIBURCIO: Si llega aquí es que he pasado la validación y por tanto se va a la siguiente actividad

        Intent intent_start = new Intent(this, ArtisticExpression.class);
        intent_start.putExtra("name", name); // TIBURCIO: Esta línea es para pasar "name" a la actividad ArtisticExpression
        startActivity(intent_start);
    }
}
/*código (dos maneras) para pasar editText a textView en otra actividad, y que no funciona.

Algo se me escapa porque no funciona aún probando en proyecto edittex, no funciona "onClick"
igualmente en el proyecto ValidacionFormulario, independiente, no funciona "botón validar" pese a estar el código correcto.*/

/* v1
                EditText editText_name = (EditText) findViewById(R.id.editText_name);
                String name = editText_name.getText().toString();

                Intent intent_start = new Intent(getApplicationContext(), ArtisticExpression.class);
                intent_start.putExtra("name", name);
                startActivity(intent_start);
  */
// ----------------------------
/* v2
        editText_name = (EditText)findViewById(R.id.editText_name);
        button_start = (Button) findViewById(R.id.button_start);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_start = new Intent(MainActivity.this,ArtisticExpression.class);
                intent_start.putExtra("name", editText_name.getText() + "");
                startActivity(intent_start);
            }

        });
*/


//  OCULTAR TECLADO resuelvo con atributo android:imeOptions="actionDone"
               /*
                Ocultar teclado vitual
                InputMethodManager tecladoOculto = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                tecladoOculto.hideSoftInputFromWindow(editText_name.getWindowToken(),0);
                */

