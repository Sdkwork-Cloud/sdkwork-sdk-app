package com.sdkwork.app

data class ShopCreateForm(
    val name: String? = null,
    val description: String? = null,
    val logoUrl: String? = null,
    val coverUrl: String? = null,
    val contactPhone: String? = null,
    val contactEmail: String? = null,
    val address: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val licenseNumber: String? = null,
    val tags: List<String>? = null,
    val businessHours: String? = null
)
