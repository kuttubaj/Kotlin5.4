package com.example.kotlin54.data.model

import com.google.gson.annotations.SerializedName

data class GadgetsItem(@SerializedName("path")
                       val path: String = "",
                       @SerializedName("imageUrl")
                       val imageUrl: String = "",
                       @SerializedName("name")
                       val name: String = "",
                       @SerializedName("description")
                       val description: String = "",
                       @SerializedName("id")
                       val id: Int = 0,
                       @SerializedName("version")
                       val version: Int = 0,
                       @SerializedName("released")
                       val released: Boolean = false)