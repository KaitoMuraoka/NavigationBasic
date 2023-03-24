package com.example.navigationbasic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import java.util.Random

class BeforeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // レイアウトファイルを取得
        val view = inflater.inflate(R.layout.fragment_before, container, false)
        // clickイベントリスナーを登録
        view.findViewById<Button>(R.id.btnNext).setOnClickListener { v ->
            Navigation.findNavController(v).navigate(
                BeforeFragmentDirections.actionBeforeFragmentToAfterFragment().apply {
                    num = Random().nextInt(100)
                }
            )
        }
        return view
    }
}
