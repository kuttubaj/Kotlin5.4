package com.example.kotlin54.data.model

import com.google.gson.annotations.SerializedName

data class VideosItem(@SerializedName("duration")
                      val duration: String = "",
                      @SerializedName("previewUrl")
                      val previewUrl: String = "",
                      @SerializedName("videoUrl")
                      val videoUrl: String = "",
                      @SerializedName("uploadDate")
                      val uploadDate: String = "",
                      @SerializedName("name")
                      val name: String = "",
                      @SerializedName("description")
                      val description: String = "",
                      @SerializedName("type")
                      val type: Int = 0)