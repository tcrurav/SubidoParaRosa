package com.example.rosa.edit_text;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ArtisticExpression extends Activity {


    TextView textView_hello;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView_selected;
    Button button_apply;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artistic_expression);

        showWelcome();

       /* textView_hello = (TextView) findViewById(R.id.editText_name);
        String name = getIntent().getStringExtra("name");

        textView_hello.setText("name");  */



    }

    private void showWelcome() {
        String name = getIntent().getExtras().getString("name");
        TextView textView_hello = (TextView) findViewById(R.id.editText_name);
        textView_hello.setText("¡" + "Hola" + name + "!");
    }


}
