package com.example.snackbar.ui.gastos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.snackbar.R
import com.example.snackbar.domain.Gasto

class DetailsGastosAdapter (val listGasto: List<Gasto>) : RecyclerView.Adapter<DetailsGastosAdapter.DetailsGastosViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsGastosViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_gasto, parent, false)
        return DetailsGastosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DetailsGastosViewHolder, position: Int) {
        val currentItem: Gasto = listGasto[position]
        holder.tvDescricao.setText(currentItem.descricao)
    }

    override fun getItemCount() = listGasto.size

    class DetailsGastosViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvDescricao: TextView = itemView.findViewById(R.id.tvDescricao)
    }
}