package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SettingsApi(private val client: HttpClient) {

    /** 获取模块设置 */
    suspend fun getModule(module: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/settings/$module")) as? PlusApiResultMapStringObject
    }

    /** 更新模块设置 */
    suspend fun updateModule(module: String, body: SettingsUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/$module"), body) as? PlusApiResultVoid
    }

    /** 重置模块设置 */
    suspend fun resetModule(module: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/settings/$module")) as? PlusApiResultVoid
    }

    /** 获取界面设置 */
    suspend fun getUi(): PlusApiResultUISettingsVO? {
        return client.get(ApiPaths.appPath("/settings/ui")) as? PlusApiResultUISettingsVO
    }

    /** 更新界面设置 */
    suspend fun updateUi(body: UISettingsUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/ui"), body) as? PlusApiResultVoid
    }

    /** 切换主题 */
    suspend fun switchTheme(body: ThemeSwitchForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/ui/theme"), body) as? PlusApiResultVoid
    }

    /** 切换语言 */
    suspend fun switchLanguage(body: LanguageSwitchForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/ui/language"), body) as? PlusApiResultVoid
    }

    /** 获取安全设置 */
    suspend fun getSecurity(): PlusApiResultSecuritySettingsVO? {
        return client.get(ApiPaths.appPath("/settings/security")) as? PlusApiResultSecuritySettingsVO
    }

    /** 更新安全设置 */
    suspend fun updateSecurity(body: SecuritySettingsUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/security"), body) as? PlusApiResultVoid
    }

    /** 修改密码 */
    suspend fun changePassword(body: PasswordChangeForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/security/password"), body) as? PlusApiResultVoid
    }

    /** 两步验证设置 */
    suspend fun toggleTwoFactor(body: TwoFactorToggleForm): PlusApiResultTwoFactorSetupVO? {
        return client.put(ApiPaths.appPath("/settings/security/2fa"), body) as? PlusApiResultTwoFactorSetupVO
    }

    /** 获取隐私设置 */
    suspend fun getPrivacy(): PlusApiResultPrivacySettingsVO? {
        return client.get(ApiPaths.appPath("/settings/privacy")) as? PlusApiResultPrivacySettingsVO
    }

    /** 更新隐私设置 */
    suspend fun updatePrivacy(body: PrivacySettingsUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/settings/privacy"), body) as? PlusApiResultVoid
    }

    /** 导出用户数据 */
    suspend fun exportUserData(body: DataExportForm): PlusApiResultDataExportVO? {
        return client.post(ApiPaths.appPath("/settings/data/export"), body) as? PlusApiResultDataExportVO
    }

    /** 获取所有设置 */
    suspend fun getAll(): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/settings")) as? PlusApiResultMapStringObject
    }

    /** 重置所有设置 */
    suspend fun resetAll(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/settings")) as? PlusApiResultVoid
    }

    /** 获取版本信息 */
    suspend fun getAppVersion(params: Map<String, Any>? = null): PlusApiResultAppVersionVO? {
        return client.get(ApiPaths.appPath("/settings/app/version"), params) as? PlusApiResultAppVersionVO
    }

    /** 获取功能开关 */
    suspend fun getFeatureFlags(): PlusApiResultMapStringBoolean? {
        return client.get(ApiPaths.appPath("/settings/app/features")) as? PlusApiResultMapStringBoolean
    }

    /** 获取应用配置 */
    suspend fun getAppConfig(): PlusApiResultAppConfigVO? {
        return client.get(ApiPaths.appPath("/settings/app/config")) as? PlusApiResultAppConfigVO
    }

    /** 清除本地数据 */
    suspend fun clearLocalData(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/settings/data/local")) as? PlusApiResultVoid
    }

    /** 清除缓存 */
    suspend fun clearCache(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/settings/cache")) as? PlusApiResultVoid
    }

    /** 删除账户 */
    suspend fun deleteAccount(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/settings/account")) as? PlusApiResultVoid
    }
}
