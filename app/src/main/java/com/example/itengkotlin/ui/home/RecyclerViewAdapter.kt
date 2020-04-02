package com.example.itengkotlin.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itengkotlin.R

class RecyclerViewAdapter (val wordList: ArrayList<HomeViewModel>):
RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_item,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return wordList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var word:HomeViewModel = wordList[position]
        holder.word.text = word.word
        holder.translation.text = word.translation
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item){

        var word:TextView = item.findViewById(R.id.wordOfList)
        var translation:TextView = item.findViewById(R.id.translationOfList)
    }
}