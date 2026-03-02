package com.sdkwork.app

data class UserAddressUpdateForm(
    val name: String? = null,
    val phone: String? = null,
    val countryCode: String? = null,
    val provinceCode: String? = null,
    val cityCode: String? = null,
    val districtCode: String? = null,
    val addressDetail: String? = null,
    val postalCode: String? = null,
    val isDefault: Boolean? = null
)
