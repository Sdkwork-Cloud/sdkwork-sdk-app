package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AddressApi {
    private final HttpClient client;
    
    public AddressApi(HttpClient client) {
        this.client = client;
    }

    /** 获取地址详情 */
    public PlusApiResultUserAddressVO getAddressDetail(String addressId) throws Exception {
        return (PlusApiResultUserAddressVO) client.get(ApiPaths.appPath("/user/address/" + addressId + ""));
    }

    /** 更新地址 */
    public PlusApiResultUserAddressVO updateAddress(String addressId, UserAddressUpdateForm body) throws Exception {
        return (PlusApiResultUserAddressVO) client.put(ApiPaths.appPath("/user/address/" + addressId + ""), body);
    }

    /** 删除地址 */
    public PlusApiResultVoid deleteAddress(String addressId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/user/address/" + addressId + ""));
    }

    /** 设置默认地址 */
    public PlusApiResultUserAddressVO setDefault(String addressId) throws Exception {
        return (PlusApiResultUserAddressVO) client.put(ApiPaths.appPath("/user/address/" + addressId + "/default"), null);
    }

    /** 获取地址列表 */
    public PlusApiResultListUserAddressVO listAddresses() throws Exception {
        return (PlusApiResultListUserAddressVO) client.get(ApiPaths.appPath("/user/address"));
    }

    /** 创建地址 */
    public PlusApiResultUserAddressVO createAddress(UserAddressCreateForm body) throws Exception {
        return (PlusApiResultUserAddressVO) client.post(ApiPaths.appPath("/user/address"), body);
    }

    /** 获取默认地址 */
    public PlusApiResultUserAddressVO getDefault() throws Exception {
        return (PlusApiResultUserAddressVO) client.get(ApiPaths.appPath("/user/address/default"));
    }
}
