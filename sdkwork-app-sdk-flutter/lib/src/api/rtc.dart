import '../http/client.dart';
import '../models.dart';

class RtcApi {
  final HttpClient _client;
  
  RtcApi(this._client);

  /// Create RTC room
  Future<PlusApiResultMapStringObject?> createRoom(CreateRoomRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/rtc/rooms'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Create RTC room token
  Future<PlusApiResultMapStringObject?> createRoomToken(String roomId) async {
    final response = await _client.post(ApiPaths.appPath('/rtc/rooms/${roomId}/token'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// End RTC room
  Future<PlusApiResultVoid?> endRoom(String roomId) async {
    final response = await _client.post(ApiPaths.appPath('/rtc/rooms/${roomId}/end'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Get RTC room
  Future<PlusApiResultMapStringObject?> getRoom(String roomId) async {
    final response = await _client.get(ApiPaths.appPath('/rtc/rooms/${roomId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List RTC records
  Future<PlusApiResultListMapStringObject?> listRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/rtc/records'), params: params);
    return response is PlusApiResultListMapStringObject ? response : null;
  }
}
