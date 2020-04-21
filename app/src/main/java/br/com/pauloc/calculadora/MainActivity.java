package br.com.pauloc.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    private ViewHolder mViewH = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edtNum10 = findViewById(R.id.edt_Num1);
        final EditText edtNum20 = findViewById(R.id.edtNum2);
        Button btnSum = findViewById(R.id.btnSum);
        Button btnSubt = findViewById(R.id.btnSubt);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMult = findViewById(R.id.btnMult);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble(edtNum10.getText().toString());
                double num2 = Double.parseDouble(edtNum20.getText().toString());
                double soma = num1 + num2;


                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado soma");
                dialogo.setMessage("A soma é " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble(edtNum10.getText().toString());
                double num2 = Double.parseDouble(edtNum20.getText().toString());
                double subt = num1 - num2;


                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado subtração");
                dialogo.setMessage("A subt é " + subt);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble(edtNum10.getText().toString());
                double num2 = Double.parseDouble(edtNum20.getText().toString());
                double div = num1 / num2;


                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado divisão");
                dialogo.setMessage("A divisão é " + div);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
        }
        });

        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble(edtNum10.getText().toString());
                double num2 = Double.parseDouble(edtNum20.getText().toString());
                double multi = num1 * num2;


                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado multiplicação");
                dialogo.setMessage("A multiplicação é " + multi);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }




    private static class ViewHolder{
        Button btnSum, btnSubt, btnDiv, btnMult;
        EditText edtNum10, edtNum20;
    }
}
