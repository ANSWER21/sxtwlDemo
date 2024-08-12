package com.seantone.sxtwl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.seantone.sxtwl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val day = Day.fromSolar(2024, 8, 12)
    }


    companion object {
        // Used to load the 'sxtwl' library on application startup.
        init {
            System.loadLibrary("sxtwl")
        }
    }
}