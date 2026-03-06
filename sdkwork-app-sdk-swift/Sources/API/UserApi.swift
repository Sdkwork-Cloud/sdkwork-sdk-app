import Foundation

public class UserApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取用户设置
    public func getUserSettings() async throws -> PlusApiResultUserSettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/user/settings"))
        return response as? PlusApiResultUserSettingsVO
    }

    /// 更新用户设置
    public func updateUserSettings(body: UserSettingsUpdateForm) async throws -> PlusApiResultUserSettingsVO? {
        let response = try await client.put(ApiPaths.appPath("/user/settings"), body: body)
        return response as? PlusApiResultUserSettingsVO
    }

    /// 获取用户信息
    public func getUserProfile() async throws -> PlusApiResultUserProfileVO? {
        let response = try await client.get(ApiPaths.appPath("/user/profile"))
        return response as? PlusApiResultUserProfileVO
    }

    /// 更新用户信息
    public func updateUserProfile(body: UserProfileUpdateForm) async throws -> PlusApiResultUserProfileVO? {
        let response = try await client.put(ApiPaths.appPath("/user/profile"), body: body)
        return response as? PlusApiResultUserProfileVO
    }

    /// 修改密码
    public func changePassword(body: PasswordChangeForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/user/password"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取地址详情
    public func getAddressDetail(addressId: String) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.get(ApiPaths.appPath("/user/address/\(addressId)"))
        return response as? PlusApiResultUserAddressVO
    }

    /// 更新地址
    public func updateAddress(addressId: String, body: UserAddressUpdateForm) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.put(ApiPaths.appPath("/user/address/\(addressId)"), body: body)
        return response as? PlusApiResultUserAddressVO
    }

    /// 删除地址
    public func deleteAddress(addressId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/user/address/\(addressId)"))
        return response as? PlusApiResultVoid
    }

    /// 设置默认地址
    public func setDefaultAddress(addressId: String) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.put(ApiPaths.appPath("/user/address/\(addressId)/default"), body: nil)
        return response as? PlusApiResultUserAddressVO
    }

    /// 注销账号
    public func deactivateAccount(body: AccountDeactivateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/user/deactivate"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 绑定第三方账号
    public func bindThirdPartyAccount(platform: String, body: ThirdPartyBindForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/user/bind/\(platform)"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 解绑第三方账号
    public func unbindThirdPartyAccount(platform: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/user/bind/\(platform)"))
        return response as? PlusApiResultVoid
    }

    /// 上传头像
    public func uploadAvatar(body: UploadAvatarRequest? = nil) async throws -> PlusApiResultMapStringString? {
        let response = try await client.post(ApiPaths.appPath("/user/avatar"), body: body)
        return response as? PlusApiResultMapStringString
    }

    /// 获取地址列表
    public func listAddresses() async throws -> PlusApiResultListUserAddressVO? {
        let response = try await client.get(ApiPaths.appPath("/user/address"))
        return response as? PlusApiResultListUserAddressVO
    }

    /// 创建地址
    public func createAddress(body: UserAddressCreateForm) async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.post(ApiPaths.appPath("/user/address"), body: body)
        return response as? PlusApiResultUserAddressVO
    }

    /// 获取登录历史
    public func getLoginHistory(params: [String: Any]? = nil) async throws -> PlusApiResultPageMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/user/history/login"), params: params)
        return response as? PlusApiResultPageMapStringObject
    }

    /// 获取生成历史
    public func getGenerationHistory(params: [String: Any]? = nil) async throws -> PlusApiResultPageMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/user/history/generations"), params: params)
        return response as? PlusApiResultPageMapStringObject
    }

    /// 获取默认地址
    public func getDefaultAddress() async throws -> PlusApiResultUserAddressVO? {
        let response = try await client.get(ApiPaths.appPath("/user/address/default"))
        return response as? PlusApiResultUserAddressVO
    }
}
