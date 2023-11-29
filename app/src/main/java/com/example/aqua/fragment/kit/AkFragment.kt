package com.example.aqua.fragment.kit

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.aqua.databinding.FragmentAkBinding

class AkFragment : Fragment() {
    lateinit var binding: FragmentAkBinding
    var oneTextValue: String = ""   //赋值成员变量管理
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAkBinding.inflate(inflater, container, false)
        if (!TextUtils.isEmpty(oneTextValue)) {
            binding?.flld?.setText(oneTextValue)
        }
        binding?.flld?.addTextChangedListener {
            oneTextValue = binding?.flld?.text.toString()
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}