package com.example.rosa.edit_text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editText_name;
    private Button button_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText_name = (EditText) findViewById(R.id.editText_name);
        String name = editText_name.getText().toString();

        Intent intent_start = new Intent(getApplicationContext(), ArtisticExpression.class);
        intent_start.putExtra("name", name);
        startActivity(intent_start);





/*
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



    }
}
