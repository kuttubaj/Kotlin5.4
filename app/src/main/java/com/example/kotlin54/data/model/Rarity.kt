package com.example.kotlin54.data.model

import com.google.gson.annotations.SerializedName

data class Rarity(@SerializedName("color")
                  val color: String = "",
                  @SerializedName("name")
                  val name: String = "",
                  @SerializedName("id")
                  val id: Int = 0)