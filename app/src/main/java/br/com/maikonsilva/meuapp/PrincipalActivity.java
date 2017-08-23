package br.com.maikonsilva.meuapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Maikon Silva on 22/08/2017.
 */

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TextView textView = new TextView(this);
        Intent intent = getIntent();

        Bundle params = intent.getExtras();

        if(params!= null){
            String mostrar_texto = params.getString("nome");
            textView.setText(mostrar_texto);
            setContentView(textView);
        }


    }

}
