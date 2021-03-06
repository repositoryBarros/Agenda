package com.company.barros.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] listaAlunos = {"rafael", "teste1", "teste2", "teste3", "teste4", "teste5", "teste6", "teste7", "teste8"};
        ListView lvAlunos = (ListView) findViewById(R.id.lvAlunos);
        ArrayAdapter<String> arrAlunos = new ArrayAdapter<String>(ListaAlunosActivity.this, android.R.layout.simple_list_item_1, listaAlunos);
        lvAlunos.setAdapter(arrAlunos);

        Button btnNovoAluno = (Button) findViewById(R.id.alu_btnNovo);

        btnNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToForm = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(goToForm);
            }
        });
    }
}
