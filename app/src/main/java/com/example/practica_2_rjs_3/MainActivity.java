package com.example.practica_2_rjs_3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText Usuario;
    public EditText Contrasena;
    public Button Login;
    public Button Limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText)findViewById(R.id.editTextUsuario);
        Contrasena = (EditText)findViewById(R.id.editTextContraseña);
        Login = (Button)findViewById(R.id.buttonLogin);
        Limpiar = (Button)findViewById(R.id.buttonLimpiar);

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                validate(Usuario.getText().toString(),Contrasena.getText().toString());
            }
        });
        Limpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Usuario.getText().clear();
                Contrasena.getText().clear();
            }
        });

    }

    private void validate(String userName, String userPass)
    {
        if((userName.equals("admin") && (userPass.equals("root"))))
        {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Credenciales Incorrectas. Favor volver a intentar. ",Toast.LENGTH_SHORT).show();
        }
    }
    public void MessageBox(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}