package com.example.applanches

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applanches.model.Lanche


class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_constraint)


        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ListarLancheAdapter( lanches = listOf(
            Lanche (nome = "Pizza de Calabresa R$ 50", bebida = "Coca Zero R$ 9", acompanhamento = "Fritas com Ervas R$ 15", sobremesa = "Torta de Limão R$ 10")
            ))

        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}