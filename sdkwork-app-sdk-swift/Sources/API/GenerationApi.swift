import Foundation

public class GenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Enhance generation prompt
    public func enhanceGenerationPrompt(body: PromptEnhanceRequest) async throws -> PlusApiResultPromptEnhanceResponse? {
        let response = try await client.post(ApiPaths.appPath("/generation/prompt/enhance"), body: body)
        return response as? PlusApiResultPromptEnhanceResponse
    }
}
