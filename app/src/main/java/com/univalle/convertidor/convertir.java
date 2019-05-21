package com.univalle.convertidor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class convertir extends AppCompatActivity {

    EditText uni;
    TextView ress;
    Double x,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertir);
        this.setTitle(ponerTitulo());
        uni=findViewById(R.id.unidad);
        ress=findViewById(R.id.resultado);
        String v= uni.getText().toString();
        x=Double.valueOf(v);
        String res="",imprimir;
        try {
            switch (operacion()) {
                case "1":
                    z = ((9 * x) / 5) + 32;
                    res = "ºF";
                    break;
                case "2":
                    z = (5 * (x - 32)) / 9;
                    res = "ºC";
                    break;
                case "3":
                    z = x + 273.15;
                    res = "ºK";
                    break;
                case "4":
                    z = x - 273.15;
                    res = "ºC";
                    break;
                case "5":
                    z = x * 100;
                    res = "cm";
                    break;
                case "6":
                    z = x / 100;
                    res = "m";
                    break;
                case "7":
                    z = x * 2.54;
                    res = "pulgadas";
                    break;
                case "8":
                    z = x / 2.54;
                    res = "cm";
                    break;
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Error!!", Toast.LENGTH_SHORT).show();
        }
        String vv=String.valueOf(z);
        imprimir=vv+" "+res;
        ress.setText(imprimir);

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
}
