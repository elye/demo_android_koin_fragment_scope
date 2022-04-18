package com.example.newfragmentproject.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newfragmentproject.MyActivityScope
import com.example.newfragmentproject.MyFragmentScope
import com.example.newfragmentproject.MySingle
import com.example.newfragmentproject.R
import org.koin.android.ext.android.inject

import org.koin.androidx.scope.ScopeFragment

class MainFragment : ScopeFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    val myFragmentScope: MyFragmentScope by inject()
    val mySingle: MySingle by inject()
    val myActivityScope: MyActivityScope by inject()

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onResume() {
        super.onResume()
        println("Testing that Fragment can access Activity and Application level dependencies")
        println("yeah $myFragmentScope $mySingle $myActivityScope is loaded")
        println("yeah $myFragmentScope $mySingle $myActivityScope is really loaded")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }
}