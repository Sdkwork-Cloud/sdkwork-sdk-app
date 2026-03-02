import '../http/client.dart';
import '../models.dart';

class GenerationApi {
  final HttpClient _client;
  
  GenerationApi(this._client);

  /// Enhance generation prompt
  Future<PlusApiResultPromptEnhanceResponse?> enhanceGenerationPrompt(PromptEnhanceRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/prompt/enhance'), body: body, contentType: 'application/json');
    return response is PlusApiResultPromptEnhanceResponse ? response : null;
  }
}
