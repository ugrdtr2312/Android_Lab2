package com.example.lab2_shengeliya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab2_shengeliya.fragments.FragmentForm
import com.example.lab2_shengeliya.fragments.FragmentResult

class MainActivity : AppCompatActivity(), FragmentForm.OnFragmentFormDataListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSendData(data: String?) {
        if (data != "") (supportFragmentManager.findFragmentById(R.id.FragmentResult) as FragmentResult?)?.setSelectedItem(data)
    }
}