package com.example.itengkotlin.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itengkotlin.R

class ArticalsRecyclerViewAdapter (val ArticalsList: ArrayList<Articlas>):
      RecyclerView.Adapter<ArticalsRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.articals_items, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ArticalsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var artical: Articlas = ArticalsList[position]
        holder.title.text = artical.title
        holder.artical.text = artical.article
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        var title: TextView = item.findViewById(R.id.articalsTitle)
        var artical: TextView = item.findViewById(R.id.artical)
    }
}