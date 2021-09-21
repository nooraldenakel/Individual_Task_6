package com.example.individualtasks.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import com.example.individualtasks.databinding.FragmentDownBinding
import com.example.individualtasks.util.Constant

class DownFragment : BaseFragment<FragmentDownBinding>() {
    private lateinit var dataReceived : String
    override val bindingInflater: (LayoutInflater) -> FragmentDownBinding = FragmentDownBinding::inflate
    override val LOG_TAG = "DownFragment"
    override fun setup() {
        binding?.myTextView?.text = dataReceived
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataReceived = arguments?.getString(Constant.KEY_TAG).toString()
    }
}
