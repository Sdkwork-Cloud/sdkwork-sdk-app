import '../http/client.dart';
import '../models.dart';

class AddressApi {
  final HttpClient _client;
  
  AddressApi(this._client);

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
  Future<PlusApiResultUserAddressVO?> setDefault(String addressId) async {
    final response = await _client.put(ApiPaths.appPath('/user/address/${addressId}/default'));
    return response is PlusApiResultUserAddressVO ? response : null;
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

  /// 获取默认地址
  Future<PlusApiResultUserAddressVO?> getDefault() async {
    final response = await _client.get(ApiPaths.appPath('/user/address/default'));
    return response is PlusApiResultUserAddressVO ? response : null;
  }
}
