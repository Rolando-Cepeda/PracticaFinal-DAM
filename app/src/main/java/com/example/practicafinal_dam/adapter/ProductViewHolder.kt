package com.example.practicafinal_dam.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.practicafinal_dam.Product
import com.example.practicafinal_dam.databinding.ItemProductBinding

class ProductViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemProductBinding.bind(view)



    fun render(productModel: Product) {
        binding.tvProductName.text = productModel.nameProduct
        binding.tvPrice.text = productModel.price.toString()
        binding.tvDescription.text = productModel.description

    }
}