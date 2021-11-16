package com.example.applicationwithsql.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.applicationwithsql.R
import com.example.applicationwithsql.databinding.FragmentTaskBinding
import com.google.firebase.auth.FirebaseAuth


class TaskFragment : Fragment() {
    lateinit var binding: FragmentTaskBinding
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTaskBinding.inflate(inflater,container,false)
        firebaseAuth = FirebaseAuth.getInstance()



        binding.imgBack.setOnClickListener{
            firebaseAuth.signOut();
        it.findNavController().navigate(R.id.action_taskFragment_to_loginFragment)

        }
        binding.imgAdd.setOnClickListener{
it.findNavController().navigate(R.id.action_taskFragment_to_registerTaskFragment)

        }

        return binding.root
    }

}