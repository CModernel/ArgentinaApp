package com.example.argentinaapp.presentation.ui.OrderFragment.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.argentinaapp.databinding.FragmentOrderBinding
import com.example.argentinaapp.presentation.ui.OrderFragment.viewmodel.FragmentOrderViewModel

class FragmentOrder : Fragment() {

    private lateinit var viewModel: FragmentOrderViewModel
    private lateinit var binding: FragmentOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(inflater, container, false)
        val mainActivity = activity as AppCompatActivity
        mainActivity.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setTitle()
    }

    private fun setTitle(){
        val toolbar = (requireActivity() as AppCompatActivity).supportActionBar
        toolbar?.title = "FragmentOrder"
    }
}