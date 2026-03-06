package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SettingsApi {
    private final HttpClient client;
    
    public SettingsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取模块设置 */
    public PlusApiResultMapStringObject getModule(String module) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/settings/" + module + ""));
    }

    /** 更新模块设置 */
    public PlusApiResultVoid updateModule(String module, SettingsUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/" + module + ""), body);
    }

    /** 重置模块设置 */
    public PlusApiResultVoid resetModule(String module) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/settings/" + module + ""));
    }

    /** 获取界面设置 */
    public PlusApiResultUISettingsVO getUi() throws Exception {
        return (PlusApiResultUISettingsVO) client.get(ApiPaths.appPath("/settings/ui"));
    }

    /** 更新界面设置 */
    public PlusApiResultVoid updateUi(UISettingsUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/ui"), body);
    }

    /** 切换主题 */
    public PlusApiResultVoid switchTheme(ThemeSwitchForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/ui/theme"), body);
    }

    /** 切换语言 */
    public PlusApiResultVoid switchLanguage(LanguageSwitchForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/ui/language"), body);
    }

    /** 获取安全设置 */
    public PlusApiResultSecuritySettingsVO getSecurity() throws Exception {
        return (PlusApiResultSecuritySettingsVO) client.get(ApiPaths.appPath("/settings/security"));
    }

    /** 更新安全设置 */
    public PlusApiResultVoid updateSecurity(SecuritySettingsUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/security"), body);
    }

    /** 修改密码 */
    public PlusApiResultVoid changePassword(PasswordChangeForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/security/password"), body);
    }

    /** 两步验证设置 */
    public PlusApiResultTwoFactorSetupVO toggleTwoFactor(TwoFactorToggleForm body) throws Exception {
        return (PlusApiResultTwoFactorSetupVO) client.put(ApiPaths.appPath("/settings/security/2fa"), body);
    }

    /** 获取隐私设置 */
    public PlusApiResultPrivacySettingsVO getPrivacy() throws Exception {
        return (PlusApiResultPrivacySettingsVO) client.get(ApiPaths.appPath("/settings/privacy"));
    }

    /** 更新隐私设置 */
    public PlusApiResultVoid updatePrivacy(PrivacySettingsUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/settings/privacy"), body);
    }

    /** 导出用户数据 */
    public PlusApiResultDataExportVO exportUserData(DataExportForm body) throws Exception {
        return (PlusApiResultDataExportVO) client.post(ApiPaths.appPath("/settings/data/export"), body);
    }

    /** 获取所有设置 */
    public PlusApiResultMapStringObject getAll() throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/settings"));
    }

    /** 重置所有设置 */
    public PlusApiResultVoid resetAll() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/settings"));
    }

    /** 获取版本信息 */
    public PlusApiResultAppVersionVO getAppVersion(Map<String, Object> params) throws Exception {
        return (PlusApiResultAppVersionVO) client.get(ApiPaths.appPath("/settings/app/version"), params);
    }

    /** 获取功能开关 */
    public PlusApiResultMapStringBoolean getFeatureFlags() throws Exception {
        return (PlusApiResultMapStringBoolean) client.get(ApiPaths.appPath("/settings/app/features"));
    }

    /** 获取应用配置 */
    public PlusApiResultAppConfigVO getAppConfig() throws Exception {
        return (PlusApiResultAppConfigVO) client.get(ApiPaths.appPath("/settings/app/config"));
    }

    /** 清除本地数据 */
    public PlusApiResultVoid clearLocalData() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/settings/data/local"));
    }

    /** 清除缓存 */
    public PlusApiResultVoid clearCache() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/settings/cache"));
    }

    /** 删除账户 */
    public PlusApiResultVoid deleteAccount() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/settings/account"));
    }
}
