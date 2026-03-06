import Foundation

public class RtcApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create RTC room
    public func createRoom(body: CreateRoomRequest? = nil) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/rtc/rooms"), body: body)
        return response as? PlusApiResultMapStringObject
    }

    /// Create RTC room token
    public func createRoomToken(roomId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.post(ApiPaths.appPath("/rtc/rooms/\(roomId)/token"), body: nil)
        return response as? PlusApiResultMapStringObject
    }

    /// End RTC room
    public func endRoom(roomId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/rtc/rooms/\(roomId)/end"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// Get RTC room
    public func getRoom(roomId: String) async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/rtc/rooms/\(roomId)"))
        return response as? PlusApiResultMapStringObject
    }

    /// List RTC records
    public func listRecords(params: [String: Any]? = nil) async throws -> PlusApiResultListMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/rtc/records"), params: params)
        return response as? PlusApiResultListMapStringObject
    }
}
