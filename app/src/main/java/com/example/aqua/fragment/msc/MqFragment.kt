package com.example.aqua.fragment.kit
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aqua.databinding.FragmentMBinding
import com.example.aqua.databinding.FragmentMqBinding


class MqFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMqBinding.inflate(inflater, container, false)
        return binding.root
    }

}