import '../http/client.dart';
import '../models.dart';

class StatisticsApi {
  final HttpClient _client;
  
  StatisticsApi(this._client);

  /// 获取组织统计
  Future<PlusApiResultOrganizationStatisticsVO?> getOrganization() async {
    final response = await _client.get(ApiPaths.appPath('/organization/statistics'));
    return response is PlusApiResultOrganizationStatisticsVO ? response : null;
  }
}
