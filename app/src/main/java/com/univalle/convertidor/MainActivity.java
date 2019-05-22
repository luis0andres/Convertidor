package com.univalle.convertidor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cf,fc,ck,kc;
    Button mc,cm,cp,pc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cf=findViewById(R.id.cf);
        fc=findViewById(R.id.fc);
        ck=findViewById(R.id.ck);
        kc=findViewById(R.id.kc);
        //distancia
        mc=findViewById(R.id.mc);
        cm=findViewById(R.id.cm);
        cp=findViewById(R.id.cp);
        pc=findViewById(R.id.pc);
        //interaccion
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",cf.getText().toString());
                i.putExtra("valor","1");
                startActivity(i);
            }
        });
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",fc.getText().toString());
                i.putExtra("valor","2");
                startActivity(i);
            }
        });
        ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",ck.getText().toString());
                i.putExtra("valor","3");
                startActivity(i);
            }
        });
        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",kc.getText().toString());
                i.putExtra("valor","4");
                startActivity(i);
            }
        });
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",mc.getText().toString());
                i.putExtra("valor","5");
                startActivity(i);
            }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",cm.getText().toString());
                i.putExtra("valor","6");
                startActivity(i);
            }
        });
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",cp.getText().toString());
                i.putExtra("valor","7");
                startActivity(i);
            }
        });
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,convertir.class).putExtra("titulo",pc.getText().toString());
                i.putExtra("valor","8");
                startActivity(i);
            }
        });
    }
}
