from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DataExportForm, LanguageSwitchForm, PasswordChangeForm, PlusApiResultAppConfigVO, PlusApiResultAppVersionVO, PlusApiResultDataExportVO, PlusApiResultMapStringBoolean, PlusApiResultMapStringObject, PlusApiResultPrivacySettingsVO, PlusApiResultSecuritySettingsVO, PlusApiResultTwoFactorSetupVO, PlusApiResultUISettingsVO, PlusApiResultVoid, PrivacySettingsUpdateForm, SecuritySettingsUpdateForm, SettingsUpdateForm, ThemeSwitchForm, TwoFactorToggleForm, UISettingsUpdateForm

class SettingsApi:
    """settings API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_module(self, module: str) -> PlusApiResultMapStringObject:
        """获取模块设置"""
        return self._client.get(f"/app/v3/api/settings/{module}")

    def update_module(self, module: str, body: SettingsUpdateForm) -> PlusApiResultVoid:
        """更新模块设置"""
        return self._client.put(f"/app/v3/api/settings/{module}", json=body)

    def reset_module(self, module: str) -> PlusApiResultVoid:
        """重置模块设置"""
        return self._client.delete(f"/app/v3/api/settings/{module}")

    def get_ui(self) -> PlusApiResultUISettingsVO:
        """获取界面设置"""
        return self._client.get(f"/app/v3/api/settings/ui")

    def update_ui(self, body: UISettingsUpdateForm) -> PlusApiResultVoid:
        """更新界面设置"""
        return self._client.put(f"/app/v3/api/settings/ui", json=body)

    def switch_theme(self, body: ThemeSwitchForm) -> PlusApiResultVoid:
        """切换主题"""
        return self._client.put(f"/app/v3/api/settings/ui/theme", json=body)

    def switch_language(self, body: LanguageSwitchForm) -> PlusApiResultVoid:
        """切换语言"""
        return self._client.put(f"/app/v3/api/settings/ui/language", json=body)

    def get_security(self) -> PlusApiResultSecuritySettingsVO:
        """获取安全设置"""
        return self._client.get(f"/app/v3/api/settings/security")

    def update_security(self, body: SecuritySettingsUpdateForm) -> PlusApiResultVoid:
        """更新安全设置"""
        return self._client.put(f"/app/v3/api/settings/security", json=body)

    def change_password(self, body: PasswordChangeForm) -> PlusApiResultVoid:
        """修改密码"""
        return self._client.put(f"/app/v3/api/settings/security/password", json=body)

    def toggle_two_factor(self, body: TwoFactorToggleForm) -> PlusApiResultTwoFactorSetupVO:
        """两步验证设置"""
        return self._client.put(f"/app/v3/api/settings/security/2fa", json=body)

    def get_privacy(self) -> PlusApiResultPrivacySettingsVO:
        """获取隐私设置"""
        return self._client.get(f"/app/v3/api/settings/privacy")

    def update_privacy(self, body: PrivacySettingsUpdateForm) -> PlusApiResultVoid:
        """更新隐私设置"""
        return self._client.put(f"/app/v3/api/settings/privacy", json=body)

    def export_user_data(self, body: DataExportForm) -> PlusApiResultDataExportVO:
        """导出用户数据"""
        return self._client.post(f"/app/v3/api/settings/data/export", json=body)

    def get_all(self) -> PlusApiResultMapStringObject:
        """获取所有设置"""
        return self._client.get(f"/app/v3/api/settings")

    def reset_all(self) -> PlusApiResultVoid:
        """重置所有设置"""
        return self._client.delete(f"/app/v3/api/settings")

    def get_app_version(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultAppVersionVO:
        """获取版本信息"""
        return self._client.get(f"/app/v3/api/settings/app/version", params=params)

    def get_feature_flags(self) -> PlusApiResultMapStringBoolean:
        """获取功能开关"""
        return self._client.get(f"/app/v3/api/settings/app/features")

    def get_app_config(self) -> PlusApiResultAppConfigVO:
        """获取应用配置"""
        return self._client.get(f"/app/v3/api/settings/app/config")

    def clear_local_data(self) -> PlusApiResultVoid:
        """清除本地数据"""
        return self._client.delete(f"/app/v3/api/settings/data/local")

    def clear_cache(self) -> PlusApiResultVoid:
        """清除缓存"""
        return self._client.delete(f"/app/v3/api/settings/cache")

    def delete_account(self) -> PlusApiResultVoid:
        """删除账户"""
        return self._client.delete(f"/app/v3/api/settings/account")
