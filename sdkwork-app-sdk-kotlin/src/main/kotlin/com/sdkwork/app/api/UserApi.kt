package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class UserApi(private val client: HttpClient) {

    /** 获取用户设置 */
    suspend fun getUserSettings(): PlusApiResultUserSettingsVO? {
        return client.get(ApiPaths.appPath("/user/settings")) as? PlusApiResultUserSettingsVO
    }

    /** 更新用户设置 */
    suspend fun updateUserSettings(body: UserSettingsUpdateForm): PlusApiResultUserSettingsVO? {
        return client.put(ApiPaths.appPath("/user/settings"), body) as? PlusApiResultUserSettingsVO
    }

    /** 获取用户信息 */
    suspend fun getUserProfile(): PlusApiResultUserProfileVO? {
        return client.get(ApiPaths.appPath("/user/profile")) as? PlusApiResultUserProfileVO
    }

    /** 更新用户信息 */
    suspend fun updateUserProfile(body: UserProfileUpdateForm): PlusApiResultUserProfileVO? {
        return client.put(ApiPaths.appPath("/user/profile"), body) as? PlusApiResultUserProfileVO
    }

    /** 修改密码 */
    suspend fun changePassword(body: PasswordChangeForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/user/password"), body) as? PlusApiResultVoid
    }

    /** 获取地址详情 */
    suspend fun getAddressDetail(addressId: String): PlusApiResultUserAddressVO? {
        return client.get(ApiPaths.appPath("/user/address/$addressId")) as? PlusApiResultUserAddressVO
    }

    /** 更新地址 */
    suspend fun updateAddress(addressId: String, body: UserAddressUpdateForm): PlusApiResultUserAddressVO? {
        return client.put(ApiPaths.appPath("/user/address/$addressId"), body) as? PlusApiResultUserAddressVO
    }

    /** 删除地址 */
    suspend fun deleteAddress(addressId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/user/address/$addressId")) as? PlusApiResultVoid
    }

    /** 设置默认地址 */
    suspend fun setDefaultAddress(addressId: String): PlusApiResultUserAddressVO? {
        return client.put(ApiPaths.appPath("/user/address/$addressId/default"), null) as? PlusApiResultUserAddressVO
    }

    /** 注销账号 */
    suspend fun deactivateAccount(body: AccountDeactivateForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/user/deactivate"), body) as? PlusApiResultVoid
    }

    /** 绑定第三方账号 */
    suspend fun bindThirdPartyAccount(platform: String, body: ThirdPartyBindForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/user/bind/$platform"), body) as? PlusApiResultVoid
    }

    /** 解绑第三方账号 */
    suspend fun unbindThirdPartyAccount(platform: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/user/bind/$platform")) as? PlusApiResultVoid
    }

    /** 上传头像 */
    suspend fun uploadAvatar(body: UploadAvatarRequest? = null): PlusApiResultMapStringString? {
        return client.post(ApiPaths.appPath("/user/avatar"), body) as? PlusApiResultMapStringString
    }

    /** 获取地址列表 */
    suspend fun listAddresses(): PlusApiResultListUserAddressVO? {
        return client.get(ApiPaths.appPath("/user/address")) as? PlusApiResultListUserAddressVO
    }

    /** 创建地址 */
    suspend fun createAddress(body: UserAddressCreateForm): PlusApiResultUserAddressVO? {
        return client.post(ApiPaths.appPath("/user/address"), body) as? PlusApiResultUserAddressVO
    }

    /** 获取登录历史 */
    suspend fun getLoginHistory(params: Map<String, Any>? = null): PlusApiResultPageMapStringObject? {
        return client.get(ApiPaths.appPath("/user/history/login"), params) as? PlusApiResultPageMapStringObject
    }

    /** 获取生成历史 */
    suspend fun getGenerationHistory(params: Map<String, Any>? = null): PlusApiResultPageMapStringObject? {
        return client.get(ApiPaths.appPath("/user/history/generations"), params) as? PlusApiResultPageMapStringObject
    }

    /** 获取默认地址 */
    suspend fun getDefaultAddress(): PlusApiResultUserAddressVO? {
        return client.get(ApiPaths.appPath("/user/address/default")) as? PlusApiResultUserAddressVO
    }
}
