package br.giovanninibarbosa.combustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    private TextView resultadoLbl;
    private EditText edtGasosa;
    private EditText edtAlcool;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Localizar componentes na tela..
        resultadoLbl = (TextView) findViewById(R.id.result_id);
        edtGasosa = (EditText) findViewById(R.id.gasolina_id);
        edtAlcool = (EditText) findViewById(R.id.alcool_id);
        btnResult = (Button) findViewById(R.id.btn_id);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Recuperar dados digitados..

                String PrecoAlcool = edtAlcool.getText().toString();
                String PrecoGasosa = edtGasosa.getText().toString();

                // Converter as strings para double..

                Double valorAlcool = Double.parseDouble(PrecoAlcool);
                Double valorGasosa = Double.parseDouble(PrecoGasosa);

                // Calculo para verificar qual é a melhor opção..

                double resultado = valorAlcool / valorGasosa;

                if (resultado >= 0.7) {

                    resultadoLbl.setText("É melhor utilizar a  gasolina: " + resultado);

                } else {

                    resultadoLbl.setText("É melhor utilizar o álcool, resultado: " + resultado );
                }

            }
        });
    }
}
