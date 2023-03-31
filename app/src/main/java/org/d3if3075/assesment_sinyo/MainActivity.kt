package org.d3if3075.assesment_sinyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if3075.assesment_sinyo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.x.setOnClickListener { hitungluas() }
        }

    private fun hitungluas() {
        val lebar = binding.lebar.text.toString()
        if (TextUtils.isEmpty(lebar)) {
            Toast.makeText(this, R.string.lebarIn, Toast.LENGTH_LONG).show()
            return
        }
        val tinggi = binding.tinggi.text.toString()
        if (TextUtils.isEmpty(tinggi)) {
            Toast.makeText(this, R.string.tinggi_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val hasil = lebar.toFloat()*tinggi.toFloat()

            binding.textView4.text = hasil.toString()+" cm[2]"

    }
    }

