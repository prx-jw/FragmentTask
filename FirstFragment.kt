package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FirstFragment : Fragment(R.layout.fragment_first) {

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val root = inflater.inflate(R.layout.fragment_first, container, false)
//        return root
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         val button = view.findViewById<Button>(R.id.swithButton)
        button.setOnClickListener {
            (requireActivity() as MainActivity).swithToSecondFragment()
        }
    }

    companion object {
         // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            FirstFragment()

    }
}