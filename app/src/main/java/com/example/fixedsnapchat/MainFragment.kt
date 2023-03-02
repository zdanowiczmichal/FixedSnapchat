package com.example.fixedsnapchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fixedsnapchat.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _tiernan: FragmentMainBinding? = null
    private val tiernan get() = _tiernan!!
    private val snaps = listOf(Snap("Yoda", R.drawable.yoda, "22", false),
        Snap("Palpatine", R.drawable.emperor, "12", false),
        Snap("Obi Wan", R.drawable.obi, "1", false)
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _tiernan = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = tiernan.root

        val mAdapter = SnapAdapter(snaps)
        tiernan.recyclerView.adapter = mAdapter

        return rootView
    }
}