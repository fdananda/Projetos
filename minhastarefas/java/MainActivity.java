package com.fdananda.minhastarefas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private DiariasFragment diariasFragment;
    private EventuaisFragment eventuaisFragment;
    private AdicionarFragment adicionarFragment;
    private VerTodasFragment verTodasFragment;
    private Button buttonAtvsDiarias;
    private Button buttonAtvsEventuais;
    private Button buttonAtvsAdicionar;
    private TextView textVerTodas;
    private TextView textRealizadas;
    private TextView textAReaizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar componentes
        diariasFragment   = new DiariasFragment();
        eventuaisFragment = new EventuaisFragment();
        adicionarFragment = new AdicionarFragment();
        verTodasFragment  = new VerTodasFragment();
        buttonAtvsDiarias = findViewById(R.id.buttonAtvsDiarias);
        buttonAtvsEventuais = findViewById(R.id.buttonAtvsEventuais);
        buttonAtvsAdicionar = findViewById(R.id.buttonAtvsAdicionar);
        textVerTodas        = findViewById(R.id.textVerTodas);
        textRealizadas      = findViewById(R.id.textRealizadas);
        textAReaizar        = findViewById(R.id.textARealizar);

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

        //Clique no texto Ver Todas
        textVerTodas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Apresentar o conteúdo AdicionarFragment com o clique do botão
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, verTodasFragment);
                transaction.commit();
            }
        });
    }
}
