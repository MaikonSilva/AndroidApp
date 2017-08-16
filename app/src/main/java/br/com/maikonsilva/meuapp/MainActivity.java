package br.com.maikonsilva.meuapp;

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


        btnAcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = editTextNome.getText().toString();
                String telefone = editTextNome1.getText().toString();
                String endereco = editTextNome2.getText().toString();
                String sitesocial = editTextNome3.getText().toString();
                String nota = editTextNome4.getText().toString();

                if(savedInstanceState != null){
                    Toast.makeText(MainActivity.this, savedInstanceState.getString("chave"), Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(MainActivity.this, "Nome: " + nome + "Endereço:" + endereco + "Telefone: " + telefone + "Site Social:" + sitesocial + " Nota:" + nota, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("chave","minha app tratou !");
        super.onSaveInstanceState(outState);
    }
}


