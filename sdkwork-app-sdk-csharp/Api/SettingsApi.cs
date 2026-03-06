using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SettingsApi
    {
        private readonly HttpClient _client;

        public SettingsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取模块设置
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetModuleAsync(string module)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/settings/{module}"));
        }

        /// <summary>
        /// 更新模块设置
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateModuleAsync(string module, SettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/settings/{module}"), body);
        }

        /// <summary>
        /// 重置模块设置
        /// </summary>
        public async Task<PlusApiResultVoid?> ResetModuleAsync(string module)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/settings/{module}"));
        }

        /// <summary>
        /// 获取界面设置
        /// </summary>
        public async Task<PlusApiResultUISettingsVO?> GetUiAsync()
        {
            return await _client.GetAsync<PlusApiResultUISettingsVO>(ApiPaths.AppPath("/settings/ui"));
        }

        /// <summary>
        /// 更新界面设置
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateUiAsync(UISettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/ui"), body);
        }

        /// <summary>
        /// 切换主题
        /// </summary>
        public async Task<PlusApiResultVoid?> SwitchThemeAsync(ThemeSwitchForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/ui/theme"), body);
        }

        /// <summary>
        /// 切换语言
        /// </summary>
        public async Task<PlusApiResultVoid?> SwitchLanguageAsync(LanguageSwitchForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/ui/language"), body);
        }

        /// <summary>
        /// 获取安全设置
        /// </summary>
        public async Task<PlusApiResultSecuritySettingsVO?> GetSecurityAsync()
        {
            return await _client.GetAsync<PlusApiResultSecuritySettingsVO>(ApiPaths.AppPath("/settings/security"));
        }

        /// <summary>
        /// 更新安全设置
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateSecurityAsync(SecuritySettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/security"), body);
        }

        /// <summary>
        /// 修改密码
        /// </summary>
        public async Task<PlusApiResultVoid?> ChangePasswordAsync(PasswordChangeForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/security/password"), body);
        }

        /// <summary>
        /// 两步验证设置
        /// </summary>
        public async Task<PlusApiResultTwoFactorSetupVO?> ToggleTwoFactorAsync(TwoFactorToggleForm body)
        {
            return await _client.PutAsync<PlusApiResultTwoFactorSetupVO>(ApiPaths.AppPath("/settings/security/2fa"), body);
        }

        /// <summary>
        /// 获取隐私设置
        /// </summary>
        public async Task<PlusApiResultPrivacySettingsVO?> GetPrivacyAsync()
        {
            return await _client.GetAsync<PlusApiResultPrivacySettingsVO>(ApiPaths.AppPath("/settings/privacy"));
        }

        /// <summary>
        /// 更新隐私设置
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdatePrivacyAsync(PrivacySettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/privacy"), body);
        }

        /// <summary>
        /// 导出用户数据
        /// </summary>
        public async Task<PlusApiResultDataExportVO?> ExportUserDataAsync(DataExportForm body)
        {
            return await _client.PostAsync<PlusApiResultDataExportVO>(ApiPaths.AppPath("/settings/data/export"), body);
        }

        /// <summary>
        /// 获取所有设置
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetAllAsync()
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/settings"));
        }

        /// <summary>
        /// 重置所有设置
        /// </summary>
        public async Task<PlusApiResultVoid?> ResetAllAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings"));
        }

        /// <summary>
        /// 获取版本信息
        /// </summary>
        public async Task<PlusApiResultAppVersionVO?> GetAppVersionAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultAppVersionVO>(ApiPaths.AppPath("/settings/app/version"), query);
        }

        /// <summary>
        /// 获取功能开关
        /// </summary>
        public async Task<PlusApiResultMapStringBoolean?> GetFeatureFlagsAsync()
        {
            return await _client.GetAsync<PlusApiResultMapStringBoolean>(ApiPaths.AppPath("/settings/app/features"));
        }

        /// <summary>
        /// 获取应用配置
        /// </summary>
        public async Task<PlusApiResultAppConfigVO?> GetAppConfigAsync()
        {
            return await _client.GetAsync<PlusApiResultAppConfigVO>(ApiPaths.AppPath("/settings/app/config"));
        }

        /// <summary>
        /// 清除本地数据
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearLocalDataAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/data/local"));
        }

        /// <summary>
        /// 清除缓存
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearCacheAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/cache"));
        }

        /// <summary>
        /// 删除账户
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteAccountAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/settings/account"));
        }
    }
}
