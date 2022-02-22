package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView total,repro,dos;
    private EditText mat1,mat2,mat3,res,mat5,mat4,mat6,mat7,mat8,mat9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        mat1=(EditText)findViewById(R.id.cali10);
        mat2=(EditText)findViewById(R.id.cali2);
        mat3=(EditText)findViewById(R.id.cali3);
        mat4=(EditText)findViewById(R.id.cali4);
        mat5=(EditText)findViewById(R.id.cali5);
        mat6=(EditText)findViewById(R.id.cali6);
        mat7=(EditText)findViewById(R.id.cali7);
        mat8=(EditText)findViewById(R.id.cali8);
        mat9=(EditText)findViewById(R.id.cali9);

        total = findViewById(R.id.total);
        repro = findViewById(R.id.reprobadas);
        dos = findViewById(R.id.dos);


    }
    public void promedio(View view){



        String materia1=mat1.getText().toString();
        String materia2=mat2.getText().toString();
        String materia3=mat3.getText().toString();
        String materia4=mat4.getText().toString();
        String materia5=mat5.getText().toString();
        String materia6=mat6.getText().toString();
        String materia7=mat7.getText().toString();
        String materia8=mat8.getText().toString();
        String materia9=mat9.getText().toString();
        if(materia1.matches("5")||materia2.matches("5")||materia3.matches("5")||materia4.matches("5")||materia6.matches("5")||materia7.matches("5")||materia8.matches("5")||materia9.matches("5")){
            repro.setText("Tienes materias reporbadas :(");



        }
        dos= (TextView) findViewById(R.id.dos);
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);
                intent1.putExtra("uno", materia1);
                intent1.putExtra("dos", materia2);
                intent1.putExtra("tres", materia3);
                intent1.putExtra("cuatro", materia4);
                intent1.putExtra("cinco", materia5);
                intent1.putExtra("seis", materia6);
                intent1.putExtra("siete", materia7);
                intent1.putExtra("ocho", materia8);

                startActivity(intent1);
            }
        });





        double mate1=Double.parseDouble(materia1);
        double mate2=Double.parseDouble(materia2);
        double mate3=Double.parseDouble(materia3);
        double mate4=Double.parseDouble(materia4);
        double mate5=Double.parseDouble(materia5);
        double mate6=Double.parseDouble(materia6);
        double mate7=Double.parseDouble(materia7);
        double mate8=Double.parseDouble(materia8);
        double mate9=Double.parseDouble(materia9);
        Double promedio=(mate1+mate2+mate3+mate4+mate5+mate6+mate7+mate8+mate9)/9;

        String result=String.valueOf(promedio);

        total.setText("Tu promedio es:"+result);



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