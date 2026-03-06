package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class UserApi {
    private final HttpClient client;
    
    public UserApi(HttpClient client) {
        this.client = client;
    }

    /** 获取用户设置 */
    public PlusApiResultUserSettingsVO getUserSettings() throws Exception {
        return (PlusApiResultUserSettingsVO) client.get(ApiPaths.appPath("/user/settings"));
    }

    /** 更新用户设置 */
    public PlusApiResultUserSettingsVO updateUserSettings(UserSettingsUpdateForm body) throws Exception {
        return (PlusApiResultUserSettingsVO) client.put(ApiPaths.appPath("/user/settings"), body);
    }

    /** 获取用户信息 */
    public PlusApiResultUserProfileVO getUserProfile() throws Exception {
        return (PlusApiResultUserProfileVO) client.get(ApiPaths.appPath("/user/profile"));
    }

    /** 更新用户信息 */
    public PlusApiResultUserProfileVO updateUserProfile(UserProfileUpdateForm body) throws Exception {
        return (PlusApiResultUserProfileVO) client.put(ApiPaths.appPath("/user/profile"), body);
    }

    /** 修改密码 */
    public PlusApiResultVoid changePassword(PasswordChangeForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/user/password"), body);
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
    public PlusApiResultUserAddressVO setDefaultAddress(String addressId) throws Exception {
        return (PlusApiResultUserAddressVO) client.put(ApiPaths.appPath("/user/address/" + addressId + "/default"), null);
    }

    /** 注销账号 */
    public PlusApiResultVoid deactivateAccount(AccountDeactivateForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/user/deactivate"), body);
    }

    /** 绑定第三方账号 */
    public PlusApiResultVoid bindThirdPartyAccount(String platform, ThirdPartyBindForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/user/bind/" + platform + ""), body);
    }

    /** 解绑第三方账号 */
    public PlusApiResultVoid unbindThirdPartyAccount(String platform) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/user/bind/" + platform + ""));
    }

    /** 上传头像 */
    public PlusApiResultMapStringString uploadAvatar(UploadAvatarRequest body) throws Exception {
        return (PlusApiResultMapStringString) client.post(ApiPaths.appPath("/user/avatar"), body);
    }

    /** 获取地址列表 */
    public PlusApiResultListUserAddressVO listAddresses() throws Exception {
        return (PlusApiResultListUserAddressVO) client.get(ApiPaths.appPath("/user/address"));
    }

    /** 创建地址 */
    public PlusApiResultUserAddressVO createAddress(UserAddressCreateForm body) throws Exception {
        return (PlusApiResultUserAddressVO) client.post(ApiPaths.appPath("/user/address"), body);
    }

    /** 获取登录历史 */
    public PlusApiResultPageMapStringObject getLoginHistory(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMapStringObject) client.get(ApiPaths.appPath("/user/history/login"), params);
    }

    /** 获取生成历史 */
    public PlusApiResultPageMapStringObject getGenerationHistory(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMapStringObject) client.get(ApiPaths.appPath("/user/history/generations"), params);
    }

    /** 获取默认地址 */
    public PlusApiResultUserAddressVO getDefaultAddress() throws Exception {
        return (PlusApiResultUserAddressVO) client.get(ApiPaths.appPath("/user/address/default"));
    }
}
