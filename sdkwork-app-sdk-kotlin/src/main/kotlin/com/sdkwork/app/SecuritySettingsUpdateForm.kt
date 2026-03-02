package com.sdkwork.app

data class SecuritySettingsUpdateForm(
    val twoFactorEnabled: Boolean? = null,
    val biometricEnabled: Boolean? = null,
    val autoLockEnabled: Boolean? = null,
    val autoLockMinutes: Int? = null,
    val loginNotificationsEnabled: Boolean? = null,
    val ipRestrictionEnabled: Boolean? = null,
    val allowedIps: List<String>? = null,
    val passwordStrengthCheckEnabled: Boolean? = null,
    val passwordExpiryDays: Int? = null
)
