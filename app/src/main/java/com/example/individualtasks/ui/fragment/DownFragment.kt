package com.example.individualtasks.ui.fragment

import android.view.LayoutInflater
import com.example.individualtasks.databinding.FragmentDownBinding
import com.example.individualtasks.util.Constant

class DownFragment : BaseFragment<FragmentDownBinding>() {
    private lateinit var dataReceived : String
    override val bindingInflater: (LayoutInflater) -> FragmentDownBinding = FragmentDownBinding::inflate
    override val LOG_TAG = "DownFragment"
    override fun setup() {
        dataReceived = arguments?.getString(Constant.KEY_TAG)?: " "
        binding?.myTextView?.text = dataReceived
    }
}
