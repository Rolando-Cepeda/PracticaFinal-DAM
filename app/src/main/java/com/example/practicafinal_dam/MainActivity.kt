package com.example.practicafinal_dam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicafinal_dam.adapter.ProductAdapter
import com.example.practicafinal_dam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        binding.recyclerProduct.layoutManager = LinearLayoutManager(this)
        binding.recyclerProduct.adapter = ProductAdapter(ProductProvider.productList)
    }
}