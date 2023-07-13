package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.USUARIO);
        cajaContraseña=findViewById(R.id.contraseña);
        //capturando datos de los editex(cajas)
        String nombreUsuario=cajaNombreUsuario.getText().toString();
    String contraseña=cajaContraseña.getText().toString();

    }
}