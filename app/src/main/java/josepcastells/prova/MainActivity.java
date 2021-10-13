
package josepcastells.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv1;
    EditText input1;
    Double resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Button igual = (Button) findViewById(R.id.igual);
        Button suma = (Button) findViewById(R.id.suma);
        Button resta = (Button) findViewById(R.id.resta);
        Button divisio = (Button) findViewById(R.id.divisio);
        Button multiplicacio = (Button) findViewById(R.id.multiplicacio);


        tv1 = findViewById(R.id.tv1);
        input1 = findViewById(R.id.input1);
        igual.setOnClickListener(this);
        multiplicacio.setOnClickListener(this);
        suma.setOnClickListener(this);
        divisio.setOnClickListener(this);
        resta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case (R.id.multiplicacio): {
            //multiplicacio
                String var1 = input1.getText().toString();
                System.out.println(var1);
                input1.setText("");
                if (!input1.toString().equalsIgnoreCase("")){
                    String var2 = input1.getText().toString();
                    System.out.println(var2);
                    while(!(var1.equalsIgnoreCase(""))&&!(var2.equalsIgnoreCase(""))){
                        resultat = (Double.parseDouble(var1))*(Double.parseDouble(var2));
                        System.out.println(resultat);
                    }}
                break;
            }
            case (R.id.suma): {
                //suma
                String var1 = input1.getText().toString();
                System.out.println(var1);
                input1.setText("");
                String var2 = input1.getText().toString();
                resultat = Double.parseDouble(var1) + Double.parseDouble(var2);
                System.out.println(resultat);
                break;
            }
            case (R.id.divisio): {
                //divisió
                String var1 = input1.getText().toString();
                System.out.println(var1);
                input1.setText("");
                String var2 = input1.getText().toString();
                while (Double.parseDouble(var2)==0.0){
                    input1.setText("");
                    var1="";
                }
                resultat = Double.parseDouble(var1) / Double.parseDouble(var2);
                break;
            }
            case(R.id.igual): {
                System.out.println("entro al igual");
                System.out.println(resultat);
                    input1.setText(resultat.toString());
                break;
            }
            case (R.id.resta): {
                String var1 = input1.getText().toString();
                System.out.println(var1);
                input1.setText("");
                String var2 = input1.getText().toString();
                resultat = Double.parseDouble(var1) - Double.parseDouble(var2);

            }

        }
    }
}