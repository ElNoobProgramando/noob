package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView total2,total3,total14;


    private EditText mat10,mat12,mat13,mat15,mat14,mat16,mat17,mat18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        mat10=(EditText)findViewById(R.id.cali10);
        mat12=(EditText)findViewById(R.id.cali11);
        mat13=(EditText)findViewById(R.id.cali13);
        mat14=(EditText)findViewById(R.id.cali14);
        mat15=(EditText)findViewById(R.id.cali15);
        mat16=(EditText)findViewById(R.id.cali16);
        mat17=(EditText)findViewById(R.id.cali17);
        mat18=(EditText)findViewById(R.id.cali18);


        total2 = findViewById(R.id.total2);


    }
    public void promedio2(View view){
        String materia10=mat10.getText().toString();
        String materia12=mat12.getText().toString();
        String materia13=mat13.getText().toString();
        String materia14=mat14.getText().toString();
        String materia15=mat15.getText().toString();
        String materia16=mat16.getText().toString();
        String materia17=mat17.getText().toString();
        String materia18=mat18.getText().toString();

        if(materia10.matches("5")||materia12.matches("5")||materia13.matches("5")||materia14.matches("5")||materia16.matches("5")||materia17.matches("5")||materia18.matches("5")) {

        }
        double mate10=Double.parseDouble(materia10);
        double mate12=Double.parseDouble(materia12);
        double mate13=Double.parseDouble(materia13);
        double mate14=Double.parseDouble(materia14);
        double mate15=Double.parseDouble(materia15);
        double mate16=Double.parseDouble(materia16);
        double mate17=Double.parseDouble(materia17);
        double mate18=Double.parseDouble(materia18);

        Double promedio2=(mate10+mate12+mate13+mate14+mate15+mate16+mate17+mate18)/8;

        String resulta=String.valueOf(promedio2);

        total2.setText("Tu promedio en 2do parcial es:"+resulta);





    }
    public void recibirDatos(View view){

        Bundle extras = getIntent().getExtras();
        String n1=extras.getString("uno");
        String n2=extras.getString("dos");
        String n3=extras.getString("tres");
        String n4=extras.getString("cuatro");
        String n5=extras.getString("cinco");
        String n6=extras.getString("seis");
        String n7=extras.getString("siete");
        String n8=extras.getString("ocho");


        double mate21=Double.parseDouble(n1);
        double mate22=Double.parseDouble(n2);
        double mate23=Double.parseDouble(n3);
        double mate24=Double.parseDouble(n4);
        double mate25=Double.parseDouble(n5);
        double mate26=Double.parseDouble(n6);
        double mate27=Double.parseDouble(n7);
        double mate28=Double.parseDouble(n8);


        Double promedio54=(mate21+mate22+mate23+mate24+mate25+mate26+mate27+mate28)/16;

        String resultas=String.valueOf(promedio54);
        String olas = String.valueOf(total2);
        double mate1=Double.parseDouble(resultas);
        double ma=Double.parseDouble(olas);
        Double sumas=(mate1+ma)/2;

        total3.setText("Tu promedio en 2do parcial es:"+sumas);

        total3 = findViewById(R.id.promedio4);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();

    }


}