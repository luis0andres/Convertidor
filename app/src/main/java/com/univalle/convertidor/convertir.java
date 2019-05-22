package com.univalle.convertidor;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class convertir extends AppCompatActivity {

    Button calcular;
    EditText uni, aux;
    TextView ress;
    private SharedPreferences pre;
    private SharedPreferences.Editor edit;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertir);
        this.setTitle(ponerTitulo());
        calcular=findViewById(R.id.calcular);
        uni=findViewById(R.id.unidad);
        ress=findViewById(R.id.resultado);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarvalor();
                Double x,z;
                String res;
                uni=findViewById(R.id.unidad);
                String v1= uni.getText().toString();
                x=Double.valueOf(v1);
                try {
                    switch (operacion()) {
                        case "1":
                            z = ((9 * x) / 5) + 32;
                            res= String.valueOf(z);
                            ress.setText(res+"ºF");
                            break;
                        case "2":
                            z = (5 * (x - 32)) / 9;
                            res= String.valueOf(z);
                            ress.setText(res+"ºC");
                            break;
                        case "3":
                            z = x + 273.15;
                            res= String.valueOf(z);
                            ress.setText(res+"ºK");
                            break;
                        case "4":
                            z = x - 273.15;
                            res= String.valueOf(z);
                            ress.setText(res+"ºC");
                            break;
                        case "5":
                            z = x * 100;
                            res= String.valueOf(z);
                            ress.setText(res+"cm");
                            break;
                        case "6":
                            z = x / 100;
                            res= String.valueOf(z);
                            ress.setText(res+"m");
                            break;
                        case "7":
                            z = x * 2.54;
                            res= String.valueOf(z);
                            ress.setText(res+"pulgadas");
                            break;
                        case "8":
                            z = x / 2.54;
                            res= String.valueOf(z);
                            ress.setText(res+"cm");
                            break;
                    }
                }
                catch (Exception e) {
                    ress.setText("Error al ingresar valores");
                }
            }
        });
        cargar();
        mostrar();
    }
    public String ponerTitulo()
    {
        Bundle extra= getIntent().getExtras();
        String title=extra.getString("titulo");
        return  title;
    }
    public String operacion()
    {
        Bundle v=getIntent().getExtras();
        String valor=v.getString("valor");
        return valor;
    }
    public void guardarvalor()
    {
        aux= findViewById(R.id.unidad);
        String valor= aux.getText().toString();
        SharedPreferences pref= getSharedPreferences("Unidad",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit= pref.edit();
        edit.putString("valor",valor);

        edit.apply();
        Toast.makeText(this, "Guardado Correctamente",Toast.LENGTH_SHORT).show();
    }
    public void cargar()
    {
        SharedPreferences pref= getSharedPreferences("Unidad",Context.MODE_PRIVATE);
        text=pref.getString("valor","");

    }
    public void mostrar(){
        uni.setText(text);
    }
}
