import '../http/client.dart';
import '../models.dart';

class SettingsApi {
  final HttpClient _client;
  
  SettingsApi(this._client);

  /// 获取用户设置
  Future<PlusApiResultUserSettingsVO?> getUser() async {
    final response = await _client.get(ApiPaths.appPath('/user/settings'));
    return response is PlusApiResultUserSettingsVO ? response : null;
  }

  /// 更新用户设置
  Future<PlusApiResultUserSettingsVO?> updateUser(UserSettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/settings'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserSettingsVO ? response : null;
  }

  /// 获取模块设置
  Future<PlusApiResultMapStringObject?> getModule(String module) async {
    final response = await _client.get(ApiPaths.appPath('/settings/${module}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// 更新模块设置
  Future<PlusApiResultVoid?> updateModule(String module, SettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/${module}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 重置模块设置
  Future<PlusApiResultVoid?> resetModule(String module) async {
    final response = await _client.delete(ApiPaths.appPath('/settings/${module}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取界面设置
  Future<PlusApiResultUISettingsVO?> getUi() async {
    final response = await _client.get(ApiPaths.appPath('/settings/ui'));
    return response is PlusApiResultUISettingsVO ? response : null;
  }

  /// 更新界面设置
  Future<PlusApiResultVoid?> updateUi(UISettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/ui'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 切换主题
  Future<PlusApiResultVoid?> switchTheme(ThemeSwitchForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/ui/theme'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 切换语言
  Future<PlusApiResultVoid?> switchLanguage(LanguageSwitchForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/ui/language'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取安全设置
  Future<PlusApiResultSecuritySettingsVO?> getSecurity() async {
    final response = await _client.get(ApiPaths.appPath('/settings/security'));
    return response is PlusApiResultSecuritySettingsVO ? response : null;
  }

  /// 更新安全设置
  Future<PlusApiResultVoid?> updateSecurity(SecuritySettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/security'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 修改密码
  Future<PlusApiResultVoid?> changePassword(PasswordChangeForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/security/password'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 两步验证设置
  Future<PlusApiResultTwoFactorSetupVO?> toggleTwoFactor(TwoFactorToggleForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/security/2fa'), body: body, contentType: 'application/json');
    return response is PlusApiResultTwoFactorSetupVO ? response : null;
  }

  /// 获取隐私设置
  Future<PlusApiResultPrivacySettingsVO?> getPrivacy() async {
    final response = await _client.get(ApiPaths.appPath('/settings/privacy'));
    return response is PlusApiResultPrivacySettingsVO ? response : null;
  }

  /// 更新隐私设置
  Future<PlusApiResultVoid?> updatePrivacy(PrivacySettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/settings/privacy'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 导出用户数据
  Future<PlusApiResultDataExportVO?> exportUserData(DataExportForm body) async {
    final response = await _client.post(ApiPaths.appPath('/settings/data/export'), body: body, contentType: 'application/json');
    return response is PlusApiResultDataExportVO ? response : null;
  }

  /// 获取所有设置
  Future<PlusApiResultMapStringObject?> getAll() async {
    final response = await _client.get(ApiPaths.appPath('/settings'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// 重置所有设置
  Future<PlusApiResultVoid?> resetAll() async {
    final response = await _client.delete(ApiPaths.appPath('/settings'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取版本信息
  Future<PlusApiResultAppVersionVO?> getAppVersion(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/settings/app/version'), params: params);
    return response is PlusApiResultAppVersionVO ? response : null;
  }

  /// 获取功能开关
  Future<PlusApiResultMapStringBoolean?> getFeatureFlags() async {
    final response = await _client.get(ApiPaths.appPath('/settings/app/features'));
    return response is PlusApiResultMapStringBoolean ? response : null;
  }

  /// 获取应用配置
  Future<PlusApiResultAppConfigVO?> getAppConfig() async {
    final response = await _client.get(ApiPaths.appPath('/settings/app/config'));
    return response is PlusApiResultAppConfigVO ? response : null;
  }

  /// 清除本地数据
  Future<PlusApiResultVoid?> clearLocalData() async {
    final response = await _client.delete(ApiPaths.appPath('/settings/data/local'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 清除缓存
  Future<PlusApiResultVoid?> clearCache() async {
    final response = await _client.delete(ApiPaths.appPath('/settings/cache'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 删除账户
  Future<PlusApiResultVoid?> deleteAccount() async {
    final response = await _client.delete(ApiPaths.appPath('/settings/account'));
    return response is PlusApiResultVoid ? response : null;
  }
}
