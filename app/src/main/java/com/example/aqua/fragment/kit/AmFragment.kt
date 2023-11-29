package com.example.aqua.fragment.kit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aqua.adapter.MyAdapter
import com.example.aqua.databinding.FragmentAmBinding

class AmFragment : Fragment() {
    lateinit var binding: FragmentAmBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAmBinding.inflate(inflater, container, false)
        val adapter = MyAdapter()
        binding?.viewpager?.adapter = adapter
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}