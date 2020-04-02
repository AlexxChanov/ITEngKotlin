package com.example.itengkotlin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.itengkotlin.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        slova.setOnClickListener {
//            childFragmentManager.beginTransaction()
//            .replace(R.id.nav_host_fragment,HomeFragment())
//            .addToBackStack(null)
//            .commit()
//        }

        var recyclerView:RecyclerView = view.findViewById(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)

        var word = ArrayList<HomeViewModel>()

        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))
        word.add(HomeViewModel("Debug","Пофиксить баги"))

        var adapter = RecyclerViewAdapter(word)

        recyclerView.setAdapter(adapter)



    }
}