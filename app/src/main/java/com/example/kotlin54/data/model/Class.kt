package com.example.kotlin54.data.model

import com.google.gson.annotations.SerializedName

data class Class(@SerializedName("name")
                 val name: String = "",
                 @SerializedName("id")
                 val id: Int = 0)