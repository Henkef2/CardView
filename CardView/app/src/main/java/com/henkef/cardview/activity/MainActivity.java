package com.henkef.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.henkef.cardview.R;
import com.henkef.cardview.adapter.PostagemAdapter;
import com.henkef.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define Layout das postagens

        /*LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);   //esse comando faz com que a orientação das postagens seja na horizontal */

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);  //esse comando faz com que seja exibido um gride com 2 postagens uma ao lado da outra, o numero pode ser redefinido
        recyclerPostagem.setLayoutManager( layoutManager );

        //Define Adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter( adapter );
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Pedro Freitas", "#tbt Viagem Legal!", R.drawable.imagem1);
        this.postagens.add( p );

        p = new Postagem("Dany Cristina", "Viagem, para casa!", R.drawable.imagem2);
        this.postagens.add( p );

        p = new Postagem("Luís Felipe", "Viagem em familia!", R.drawable.imagem3);
        this.postagens.add( p );

        p = new Postagem("Luan Henrique", "voltando pra casa!", R.drawable.imagem4);
        this.postagens.add( p );
    }
}