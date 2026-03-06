import Foundation

public class SettingsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取模块设置
    public func getModule(module: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/settings/\(module)"))
        return response as? PlusApiResultMapStringObject
    }

    /// 更新模块设置
    public func updateModule(module: String, body: SettingsUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/\(module)"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 重置模块设置
    public func resetModule(module: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/settings/\(module)"))
        return response as? PlusApiResultVoid
    }

    /// 获取界面设置
    public func getUi() async throws -> PlusApiResultUISettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/settings/ui"))
        return response as? PlusApiResultUISettingsVO
    }

    /// 更新界面设置
    public func updateUi(body: UISettingsUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/ui"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 切换主题
    public func switchTheme(body: ThemeSwitchForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/ui/theme"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 切换语言
    public func switchLanguage(body: LanguageSwitchForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/ui/language"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取安全设置
    public func getSecurity() async throws -> PlusApiResultSecuritySettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/settings/security"))
        return response as? PlusApiResultSecuritySettingsVO
    }

    /// 更新安全设置
    public func updateSecurity(body: SecuritySettingsUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/security"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 修改密码
    public func changePassword(body: PasswordChangeForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/security/password"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 两步验证设置
    public func toggleTwoFactor(body: TwoFactorToggleForm) async throws -> PlusApiResultTwoFactorSetupVO? {
        let response = try await client.put(ApiPaths.appPath("/settings/security/2fa"), body: body)
        return response as? PlusApiResultTwoFactorSetupVO
    }

    /// 获取隐私设置
    public func getPrivacy() async throws -> PlusApiResultPrivacySettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/settings/privacy"))
        return response as? PlusApiResultPrivacySettingsVO
    }

    /// 更新隐私设置
    public func updatePrivacy(body: PrivacySettingsUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/settings/privacy"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 导出用户数据
    public func exportUserData(body: DataExportForm) async throws -> PlusApiResultDataExportVO? {
        let response = try await client.post(ApiPaths.appPath("/settings/data/export"), body: body)
        return response as? PlusApiResultDataExportVO
    }

    /// 获取所有设置
    public func getAll() async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/settings"))
        return response as? PlusApiResultMapStringObject
    }

    /// 重置所有设置
    public func resetAll() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/settings"))
        return response as? PlusApiResultVoid
    }

    /// 获取版本信息
    public func getAppVersion(params: [String: Any]? = nil) async throws -> PlusApiResultAppVersionVO? {
        let response = try await client.get(ApiPaths.appPath("/settings/app/version"), params: params)
        return response as? PlusApiResultAppVersionVO
    }

    /// 获取功能开关
    public func getFeatureFlags() async throws -> PlusApiResultMapStringBoolean? {
        let response = try await client.get(ApiPaths.appPath("/settings/app/features"))
        return response as? PlusApiResultMapStringBoolean
    }

    /// 获取应用配置
    public func getAppConfig() async throws -> PlusApiResultAppConfigVO? {
        let response = try await client.get(ApiPaths.appPath("/settings/app/config"))
        return response as? PlusApiResultAppConfigVO
    }

    /// 清除本地数据
    public func clearLocalData() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/settings/data/local"))
        return response as? PlusApiResultVoid
    }

    /// 清除缓存
    public func clearCache() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/settings/cache"))
        return response as? PlusApiResultVoid
    }

    /// 删除账户
    public func deleteAccount() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/settings/account"))
        return response as? PlusApiResultVoid
    }
}
