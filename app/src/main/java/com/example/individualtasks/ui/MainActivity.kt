package com.example.individualtasks.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.individualtasks.R
import com.example.individualtasks.ui.fragment.DownFragment
import com.example.individualtasks.databinding.ActivityMainBinding
import com.example.individualtasks.util.Constant
import com.example.individualtasks.util.DataConnection

class MainActivity : AppCompatActivity() , DataConnection {

    private lateinit var binding : ActivityMainBinding
    private lateinit var downFragment : DownFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun dataTransition(text: String) {
        downFragment = DownFragment()
        val bundle = Bundle()
        bundle.putString(Constant.KEY_TAG,text)
        downFragment.arguments= bundle
        this.supportFragmentManager.beginTransaction().replace(R.id.downFragment, downFragment).commit()
    }
}
