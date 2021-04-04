package com.fdananda.minhastarefas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private DiariasFragment diariasFragment;
    private EventuaisFragment eventuaisFragment;
    private AdicionarFragment adicionarFragment;
    private Button buttonAtvsDiarias;
    private Button buttonAtvsEventuais;
    private Button buttonAtvsAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar componentes
        diariasFragment   = new DiariasFragment();
        eventuaisFragment = new EventuaisFragment();
        adicionarFragment = new AdicionarFragment();
        buttonAtvsDiarias = findViewById(R.id.buttonAtvsDiarias);
        buttonAtvsEventuais = findViewById(R.id.buttonAtvsEventuais);
        buttonAtvsAdicionar = findViewById(R.id.buttonAtvsAdicionar);

        //Apresentar o conteúdo inicial (DiariasFragment) sem o clique do botão
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, diariasFragment);
        transaction.commit();

        //Clique no botão Diárias
        buttonAtvsDiarias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Apresentar o conteúdo DiáriasFragment com o clique do botão
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, diariasFragment);
                transaction.commit();
            }
        });

        //Clique no botão Eventuais
        buttonAtvsEventuais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Apresentar o conteúdo EventuaisFragment com o clique do botão
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, eventuaisFragment);
                transaction.commit();
            }
        });

        //Clique no botão Adicionar
        buttonAtvsAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Apresentar o conteúdo AdicionarFragment com o clique do botão
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, adicionarFragment);
                transaction.commit();
            }
        });
    }
}
