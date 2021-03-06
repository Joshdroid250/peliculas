package com.example.creaciondeinterfaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.creaciondeinterfaz.databinding.FragmentMenuBinding
import ni.edu.uca.peliculas.databinding.FragmentMenuBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
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
        // Inflate the layout for this fragment
        fBinding = FragmentMenuBinding.inflate(layoutInflater )
        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        fBinding.BtnClasificacion.setOnClickListener{
            it.findNavController().navigate(R.id.irAClasificacion)
        }
        fBinding.BtnGenero.setOnClickListener {
            it.findNavController().navigate(R.id.irAGenero)
        }
        fBinding.BtnIdioma.setOnClickListener {
            it.findNavController().navigate(R.id.irAIdioma)
        }
        fBinding.BtnNacionalidad.setOnClickListener {
            it.findNavController().navigate(R.id.irANacionalidad)
        }
        fBinding.BtnPelicula.setOnClickListener {
            it.findNavController().navigate(R.id.irAPelicula)
        }
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MenuFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MenuFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}