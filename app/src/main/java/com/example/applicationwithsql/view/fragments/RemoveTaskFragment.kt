package com.example.applicationwithsql.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.applicationwithsql.R
import com.example.applicationwithsql.databinding.FragmentRemoveTaskBinding


class RemoveTaskFragment : Fragment() {

    lateinit var binding: FragmentRemoveTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRemoveTaskBinding.inflate(inflater,container,false)
        return binding.root
    }

}