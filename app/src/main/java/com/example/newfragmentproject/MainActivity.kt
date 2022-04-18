package com.example.newfragmentproject

import android.os.Bundle
import com.example.newfragmentproject.ui.main.MainFragment
import org.koin.androidx.scope.ScopeActivity

class MainActivity : ScopeActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}