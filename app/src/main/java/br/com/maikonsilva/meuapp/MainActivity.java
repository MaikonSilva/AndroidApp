package br.com.maikonsilva.meuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        final EditText editTextNome1 = (EditText) findViewById(R.id.editTextTelefone);
        final EditText editTextNome2 = (EditText) findViewById(R.id.editTextEndereco);
        final EditText editTextNome3 = (EditText) findViewById(R.id.editTextSiteSocial);
        final EditText editTextNome4 = (EditText) findViewById(R.id.editTextNota);
        final Button btnAcao = (Button) findViewById(R.id.buttonAcao);
        final Button buttonAcao1 =(Button) findViewById(R.id.buttonAcao1);


        btnAcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = editTextNome.getText().toString();
                String telefone = editTextNome1.getText().toString();
                String endereco = editTextNome2.getText().toString();
                String sitesocial = editTextNome3.getText().toString();
                String nota = editTextNome4.getText().toString();
                    Toast.makeText(MainActivity.this, "Nome do aluno : "+nome, Toast.LENGTH_LONG).show();

            }
        });

        buttonAcao1.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(it);
            //    String nome = editTextNome.getText().toString();
            //    Intent intent = new Intent(v.getContext(),PrincipalActivity.class);
            //    Bundle parametros = new Bundle();
            //    parametros.putString("Passando . . ",nome);
            //    intent.putExtras(parametros);
            //    startActivity(intent);
            }

        });

    }
}


