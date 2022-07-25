package com.rodan.challengechapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rodan.challengechapter4.databinding.ActivitySuitJepangBinding

class SuitJepangActivity : AppCompatActivity() {

    var binding: ActivitySuitJepangBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuitJepangBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.ibBatu?.setOnClickListener {
            binding?.tvVersus?.text = "Pemain 1 MENANG"
        }
        binding?.ibKertas?.setOnClickListener {
            binding?.tvVersus?.text = "Pemain 2 MENANG"
        }
        binding?.ibGunting?.setOnClickListener {
            binding?.tvVersus?.text = "DRAW"
        }


    }
}