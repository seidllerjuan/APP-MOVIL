package com.example.moviles_1_uan.listas

import com.example.moviles_1_uan.R

class ProductViewModel {
    fun getProducts() : List<ProductoModel>{
        var productList = mutableListOf<ProductoModel>()
        productList.add(ProductoModel(    imagens = R.drawable.baseline_surfing_24, nombre = "Iphone 17 pro max", calif = 4.8f, precio = 20.0 , entrega = "Lunes"))
        productList.add(ProductoModel(    imagens = R.drawable.laptop, nombre = "Iphone 17 pro max", calif = 4.8f, precio = 20.0 , entrega = "Lunes"))
        productList.add(ProductoModel(    imagens = R.drawable.haloverde, nombre = "Iphone 17 pro max", calif = 4.8f, precio = 20.0 , entrega = "Lunes"))
        productList.add(ProductoModel(    imagens = R.drawable.ic_launcher_background, nombre = "Iphone 17 pro max", calif = 4.8f, precio = 20.0 , entrega = "Lunes"))
        return productList
    }
}