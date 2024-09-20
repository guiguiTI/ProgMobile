package com.example.applanches

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applanches.model.Lanche

class ListarLancheAdapter(private val lanches: List<Lanche>) :
    RecyclerView.Adapter<ListarLancheAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeLanche: TextView = itemView.findViewById(R.id.nome_lanche)
        val bebidaLanche: TextView = itemView.findViewById(R.id.bebida_lanche)
        val acompanhamentoLanche: TextView = itemView.findViewById(R.id.acompanhamento_lanche)
        val sobremesaLanche: TextView = itemView.findViewById(R.id.sobremesa_lanche)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.lanche_activity, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val lanche = lanches[position]

        holder.nomeLanche.text = lanche.nome
        holder.bebidaLanche.text = lanche.bebida
        holder.acompanhamentoLanche.text = lanche.acompanhamento
        holder.sobremesaLanche.text = lanche.sobremesa


    }

    override fun getItemCount(): Int = lanches.size

}
