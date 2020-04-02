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

class ArticlesFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.articles_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        articals.setOnClickListener {
//            childFragmentManager.beginTransaction()
//                .replace(R.id.nav_host_fragment,HomeFragment())
//                .addToBackStack(null)
//                .commit()
//        }

        var recyclerView: RecyclerView = view.findViewById(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false)

        var artical = ArrayList<Articlas>()

        artical.add(Articlas("Debug","Why did Android make Kotlin a first-class supported language?\n" +
                "\n" +
                "Kotlin is an Android-compatible language that is concise, expressive, and designed to be type- and null-safe. It works with the Java language seamlessly, so it makes it easy for developers who love the Java language to keep using it but also incrementally add Kotlin code and leverage Kotlin libraries. Also, many Android developers have already found that Kotlin makes development faster and more fun, so we want to better support these Kotlin users. You can read more about Kotlin and Android here.\n" +
                "\n" +
                " \n" +
                "\n" +
                "I'm already using the Kotlin language, what changes for me?\n" +
                "\n" +
                "In the short term, we think the biggest change you'll notice is that Android Studio 3.0 and higher includes fully tested Kotlin support. We think this will result in a much easier, more stable development experience for you.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I use Kotlin with Android Studio?\n" +
                "\n" +
                "Kotlin is fully supported in Android Studio 3.0 and higher. Previously, using Kotlin required that you add the Kotlin plugin, but all new releases of Android Studio ship with these tools built in. So you can create new projects with Kotlin files, convert Java language code to Kotlin, debug Kotlin code, and more, without any extra steps. See Get Started with Kotlin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I debug Kotlin in Android Studio?\n" +
                "\n" +
                "Debugging Kotlin works just like debugging Java code. You don't need to do anything differently"))
        artical.add(Articlas("Debug","Why did Android make Kotlin a first-class supported language?\n" +
                "\n" +
                "Kotlin is an Android-compatible language that is concise, expressive, and designed to be type- and null-safe. It works with the Java language seamlessly, so it makes it easy for developers who love the Java language to keep using it but also incrementally add Kotlin code and leverage Kotlin libraries. Also, many Android developers have already found that Kotlin makes development faster and more fun, so we want to better support these Kotlin users. You can read more about Kotlin and Android here.\n" +
                "\n" +
                " \n" +
                "\n" +
                "I'm already using the Kotlin language, what changes for me?\n" +
                "\n" +
                "In the short term, we think the biggest change you'll notice is that Android Studio 3.0 and higher includes fully tested Kotlin support. We think this will result in a much easier, more stable development experience for you.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I use Kotlin with Android Studio?\n" +
                "\n" +
                "Kotlin is fully supported in Android Studio 3.0 and higher. Previously, using Kotlin required that you add the Kotlin plugin, but all new releases of Android Studio ship with these tools built in. So you can create new projects with Kotlin files, convert Java language code to Kotlin, debug Kotlin code, and more, without any extra steps. See Get Started with Kotlin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I debug Kotlin in Android Studio?\n" +
                "\n" +
                "Debugging Kotlin works just like debugging Java code. You don't need to do anything differently"))
        artical.add(Articlas("Debug","Why did Android make Kotlin a first-class supported language?\n" +
                "\n" +
                "Kotlin is an Android-compatible language that is concise, expressive, and designed to be type- and null-safe. It works with the Java language seamlessly, so it makes it easy for developers who love the Java language to keep using it but also incrementally add Kotlin code and leverage Kotlin libraries. Also, many Android developers have already found that Kotlin makes development faster and more fun, so we want to better support these Kotlin users. You can read more about Kotlin and Android here.\n" +
                "\n" +
                " \n" +
                "\n" +
                "I'm already using the Kotlin language, what changes for me?\n" +
                "\n" +
                "In the short term, we think the biggest change you'll notice is that Android Studio 3.0 and higher includes fully tested Kotlin support. We think this will result in a much easier, more stable development experience for you.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I use Kotlin with Android Studio?\n" +
                "\n" +
                "Kotlin is fully supported in Android Studio 3.0 and higher. Previously, using Kotlin required that you add the Kotlin plugin, but all new releases of Android Studio ship with these tools built in. So you can create new projects with Kotlin files, convert Java language code to Kotlin, debug Kotlin code, and more, without any extra steps. See Get Started with Kotlin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I debug Kotlin in Android Studio?\n" +
                "\n" +
                "Debugging Kotlin works just like debugging Java code. You don't need to do anything differently"))
        artical.add(Articlas("Debug","Why did Android make Kotlin a first-class supported language?\n" +
                "\n" +
                "Kotlin is an Android-compatible language that is concise, expressive, and designed to be type- and null-safe. It works with the Java language seamlessly, so it makes it easy for developers who love the Java language to keep using it but also incrementally add Kotlin code and leverage Kotlin libraries. Also, many Android developers have already found that Kotlin makes development faster and more fun, so we want to better support these Kotlin users. You can read more about Kotlin and Android here.\n" +
                "\n" +
                " \n" +
                "\n" +
                "I'm already using the Kotlin language, what changes for me?\n" +
                "\n" +
                "In the short term, we think the biggest change you'll notice is that Android Studio 3.0 and higher includes fully tested Kotlin support. We think this will result in a much easier, more stable development experience for you.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I use Kotlin with Android Studio?\n" +
                "\n" +
                "Kotlin is fully supported in Android Studio 3.0 and higher. Previously, using Kotlin required that you add the Kotlin plugin, but all new releases of Android Studio ship with these tools built in. So you can create new projects with Kotlin files, convert Java language code to Kotlin, debug Kotlin code, and more, without any extra steps. See Get Started with Kotlin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How do I debug Kotlin in Android Studio?\n" +
                "\n" +
                "Debugging Kotlin works just like debugging Java code. You don't need to do anything differently"))

        var adapter = ArticalsRecyclerViewAdapter(artical)

        recyclerView.setAdapter(adapter)



    }
}