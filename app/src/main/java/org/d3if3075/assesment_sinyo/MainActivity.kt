package org.d3if3075.assesment_sinyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { Hitung() }
    }
    private fun Hitung() {
        Log.d("MainActivity", "Tombol diklik!")
    }
}