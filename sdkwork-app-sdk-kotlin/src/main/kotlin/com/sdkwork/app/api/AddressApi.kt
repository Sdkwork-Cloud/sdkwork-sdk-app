package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AddressApi(private val client: HttpClient) {

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
    suspend fun setDefault(addressId: String): PlusApiResultUserAddressVO? {
        return client.put(ApiPaths.appPath("/user/address/$addressId/default"), null) as? PlusApiResultUserAddressVO
    }

    /** 获取地址列表 */
    suspend fun listAddresses(): PlusApiResultListUserAddressVO? {
        return client.get(ApiPaths.appPath("/user/address")) as? PlusApiResultListUserAddressVO
    }

    /** 创建地址 */
    suspend fun createAddress(body: UserAddressCreateForm): PlusApiResultUserAddressVO? {
        return client.post(ApiPaths.appPath("/user/address"), body) as? PlusApiResultUserAddressVO
    }

    /** 获取默认地址 */
    suspend fun getDefault(): PlusApiResultUserAddressVO? {
        return client.get(ApiPaths.appPath("/user/address/default")) as? PlusApiResultUserAddressVO
    }
}
