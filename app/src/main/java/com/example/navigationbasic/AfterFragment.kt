package com.example.navigationbasic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AfterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_after, container, false)
        v.findViewById<TextView>(R.id.txtValue)?.apply {
            // arguments経由で得られた値を設定
            text = "乱数:${arguments?.getInt("num")}"
        }
        return v
    }
}
