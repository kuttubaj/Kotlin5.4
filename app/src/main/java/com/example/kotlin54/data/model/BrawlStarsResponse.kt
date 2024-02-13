package com.example.kotlin54.data.model

import com.google.gson.annotations.SerializedName

data class BrawlStarsResponse(@SerializedName("list")
                              val list: List<ListItem>?)