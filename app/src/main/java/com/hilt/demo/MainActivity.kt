package com.hilt.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hilt.demo.util.replaceFragmentWithNoHistory
import com.hilt.demo.view.EmployeeSwipeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_main)
        replaceFragmentWithNoHistory(EmployeeSwipeFragment(), R.id.container_fragment)
        // someEmptyFunc()
    }

    private fun someEmptyFunc() {
    }

    private fun empty() {
    }

    private fun anotherEmpty() {
        try {
            Log.d("MainActivity", " Empty Try ")
            } catch (e: Exception) {
            Log.d("MainActivity", " Empty Catch ")
        }
    }
}
