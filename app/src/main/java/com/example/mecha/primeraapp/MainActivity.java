package com.example.mecha.primeraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //esto se llama cuando el usuario hace click en el boton SEND
    public void sendMessage(View view){
        //para que este método sea llamado en el onClick debe ser:
        //PUBLICO
        //RETORNO VACÍO
        //VIEW cómo único parámetro
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //Los intent representan INTENTOS pueden ser usados para muchas cosas, ahora para hacer
        // otra actividad
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);//agrega el texto a la actividad nueva
        startActivity(intent);
    }
}
