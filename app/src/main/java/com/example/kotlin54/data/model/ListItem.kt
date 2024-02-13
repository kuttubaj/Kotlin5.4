package com.example.kotlin54.data.model

import com.google.gson.annotations.SerializedName

data class ListItem(
                    @SerializedName("link")
                    val link: String = "",
                    @SerializedName("description")
                    val description: String = "",
                    @SerializedName("videos")
                    val videos: List<VideosItem>?,
                    @SerializedName("version")
                    val version: Int = 0,
                    @SerializedName("starPowers")
                    val starPowers: List<StarPowersItem>?,
                    @SerializedName("path")
                    val path: String = "",
                    @SerializedName("avatarId")
                    val avatarId: Int = 0,
                    @SerializedName("imageUrl")
                    val imageUrl: String = "",
                    @SerializedName("name")
                    val name: String = "",
                    @SerializedName("id")
                    val id: Int = 0,
                    @SerializedName("class")
                    val clas: Class,
                    @SerializedName("hash")
                    val hash: String = "",
                    @SerializedName("released")
                    val released: Boolean = false,
                    @SerializedName("gadgets")
                    val gadgets: List<GadgetsItem>?,
                    @SerializedName("rarity")
                    val rarity: Rarity)