package com.example.fixedsnapchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fixedsnapchat.databinding.FragmentPrankSnapBinding

class PrankSnapFragment : Fragment() {
    private var _tiernan: FragmentPrankSnapBinding? = null
    private val tiernan get() = _tiernan!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _tiernan = FragmentPrankSnapBinding.inflate(inflater, container, false)
        val rootView = tiernan.root

        return rootView
    }

}