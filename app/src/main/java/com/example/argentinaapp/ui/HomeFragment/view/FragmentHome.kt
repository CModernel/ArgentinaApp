package com.example.argentinaapp.ui.HomeFragment.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.argentinaapp.R
import com.example.argentinaapp.databinding.FragmentHomeBinding
import com.example.argentinaapp.ui.HomeFragment.viewmodel.FragmentHomeViewModel

class FragmentHome : Fragment() {

    private lateinit var viewModel: FragmentHomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val mainActivity = activity as AppCompatActivity
        mainActivity.supportActionBar?.setDisplayHomeAsUpEnabled(false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNavigateToOrder: Button = binding.btnNavigateToOrder
        btnNavigateToOrder.setOnClickListener {
            val navController = findNavController()
            var bundle = Bundle()
            //bundle.putString("bundle", "Test")
            navController.navigate(R.id.action_fragmentHome_to_fragmentOrder)
        }

        setTitle()
    }


    private fun setTitle(){
        val toolbar = (requireActivity() as AppCompatActivity).supportActionBar
        toolbar?.title = "FragmentHome"
    }
}