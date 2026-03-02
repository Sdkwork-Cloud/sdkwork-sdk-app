package com.sdkwork.app

data class ShopDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
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
    val businessHours: String? = null,
    val status: String? = null,
    val statusName: String? = null,
    val ownerId: String? = null,
    val ownerName: String? = null,
    val productCount: Int? = null,
    val orderCount: Int? = null,
    val rating: Double? = null,
    val followerCount: Int? = null
)
