package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

class ResponseUsers {

    @field:SerializedName("page")
    val page: Int? = null

    @field:SerializedName("per_page")
    val perPage: Int? = null

    @field:SerializedName("total")
    val total: Int? = null

    @field:SerializedName("total_pages")
    val totalPages: Int? = null

    @field:SerializedName("data")
    val data: List<DataItem>? = null
}