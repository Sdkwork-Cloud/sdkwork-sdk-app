import '../http/client.dart';
import '../models.dart';

class UserApi {
  final HttpClient _client;
  
  UserApi(this._client);

  /// 获取用户设置
  Future<PlusApiResultUserSettingsVO?> getUserSettings() async {
    final response = await _client.get(ApiPaths.appPath('/user/settings'));
    return response is PlusApiResultUserSettingsVO ? response : null;
  }

  /// 更新用户设置
  Future<PlusApiResultUserSettingsVO?> updateUserSettings(UserSettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/settings'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserSettingsVO ? response : null;
  }

  /// 获取用户信息
  Future<PlusApiResultUserProfileVO?> getUserProfile() async {
    final response = await _client.get(ApiPaths.appPath('/user/profile'));
    return response is PlusApiResultUserProfileVO ? response : null;
  }

  /// 更新用户信息
  Future<PlusApiResultUserProfileVO?> updateUserProfile(UserProfileUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/profile'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserProfileVO ? response : null;
  }

  /// 修改密码
  Future<PlusApiResultVoid?> changePassword(PasswordChangeForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/password'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取地址详情
  Future<PlusApiResultUserAddressVO?> getAddressDetail(String addressId) async {
    final response = await _client.get(ApiPaths.appPath('/user/address/${addressId}'));
    return response is PlusApiResultUserAddressVO ? response : null;
  }

  /// 更新地址
  Future<PlusApiResultUserAddressVO?> updateAddress(String addressId, UserAddressUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/address/${addressId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserAddressVO ? response : null;
  }

  /// 删除地址
  Future<PlusApiResultVoid?> deleteAddress(String addressId) async {
    final response = await _client.delete(ApiPaths.appPath('/user/address/${addressId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 设置默认地址
  Future<PlusApiResultUserAddressVO?> setDefaultAddress(String addressId) async {
    final response = await _client.put(ApiPaths.appPath('/user/address/${addressId}/default'));
    return response is PlusApiResultUserAddressVO ? response : null;
  }

  /// 注销账号
  Future<PlusApiResultVoid?> deactivateAccount(AccountDeactivateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/user/deactivate'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 绑定第三方账号
  Future<PlusApiResultVoid?> bindThirdPartyAccount(String platform, ThirdPartyBindForm body) async {
    final response = await _client.post(ApiPaths.appPath('/user/bind/${platform}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 解绑第三方账号
  Future<PlusApiResultVoid?> unbindThirdPartyAccount(String platform) async {
    final response = await _client.delete(ApiPaths.appPath('/user/bind/${platform}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上传头像
  Future<PlusApiResultMapStringString?> uploadAvatar(UploadAvatarRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/user/avatar'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringString ? response : null;
  }

  /// 获取地址列表
  Future<PlusApiResultListUserAddressVO?> listAddresses() async {
    final response = await _client.get(ApiPaths.appPath('/user/address'));
    return response is PlusApiResultListUserAddressVO ? response : null;
  }

  /// 创建地址
  Future<PlusApiResultUserAddressVO?> createAddress(UserAddressCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/user/address'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserAddressVO ? response : null;
  }

  /// 获取登录历史
  Future<PlusApiResultPageMapStringObject?> getLoginHistory(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/user/history/login'), params: params);
    return response is PlusApiResultPageMapStringObject ? response : null;
  }

  /// 获取生成历史
  Future<PlusApiResultPageMapStringObject?> getGenerationHistory(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/user/history/generations'), params: params);
    return response is PlusApiResultPageMapStringObject ? response : null;
  }

  /// 获取默认地址
  Future<PlusApiResultUserAddressVO?> getDefaultAddress() async {
    final response = await _client.get(ApiPaths.appPath('/user/address/default'));
    return response is PlusApiResultUserAddressVO ? response : null;
  }
}
