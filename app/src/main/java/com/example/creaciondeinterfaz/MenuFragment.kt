package com.example.creaciondeinterfaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.creaciondeinterfaz.databinding.ActivityMainBinding
import com.example.creaciondeinterfaz.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    lateinit var fBinding: FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       fBinding = FragmentMenuBinding.inflate(layoutInflater)
        return fBinding.root
    }
}