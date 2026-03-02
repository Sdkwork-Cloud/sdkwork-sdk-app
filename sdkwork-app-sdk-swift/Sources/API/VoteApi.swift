import Foundation

public class VoteApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 投票
    public func vote(body: VoteForm) async throws -> PlusApiResultVoteVO? {
        let response = try await client.post(ApiPaths.appPath("/vote"), body: body)
        return response as? PlusApiResultVoteVO
    }

    /// 取消投票
    public func cancel(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/vote"), params: params)
        return response as? PlusApiResultVoid
    }

    /// 切换投票
    public func toggle(body: VoteForm) async throws -> PlusApiResultVoteVO? {
        let response = try await client.post(ApiPaths.appPath("/vote/toggle"), body: body)
        return response as? PlusApiResultVoteVO
    }

    /// 点赞
    public func like(params: [String: Any]? = nil) async throws -> PlusApiResultVoteVO? {
        let response = try await client.post(ApiPaths.appPath("/vote/like"), body: nil, params: params)
        return response as? PlusApiResultVoteVO
    }

    /// 点踩
    public func dislike(params: [String: Any]? = nil) async throws -> PlusApiResultVoteVO? {
        let response = try await client.post(ApiPaths.appPath("/vote/dislike"), body: nil, params: params)
        return response as? PlusApiResultVoteVO
    }

    /// 获取投票详情
    public func getVoteDetail(voteId: String) async throws -> PlusApiResultVoteDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/vote/\(voteId)"))
        return response as? PlusApiResultVoteDetailVO
    }

    /// 获取热门内容
    public func getTopLikedContent(params: [String: Any]? = nil) async throws -> PlusApiResultListLong? {
        let response = try await client.get(ApiPaths.appPath("/vote/top-liked"), params: params)
        return response as? PlusApiResultListLong
    }

    /// 获取投票状态
    public func getVoteStatus(params: [String: Any]? = nil) async throws -> PlusApiResultVoteStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/vote/status"), params: params)
        return response as? PlusApiResultVoteStatusVO
    }

    /// 获取投票统计
    public func getVoteStatistics(params: [String: Any]? = nil) async throws -> PlusApiResultVoteStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/vote/statistics"), params: params)
        return response as? PlusApiResultVoteStatisticsVO
    }

    /// 获取我的投票历史
    public func getMyVotes(params: [String: Any]? = nil) async throws -> PlusApiResultPageVoteDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/vote/my-votes"), params: params)
        return response as? PlusApiResultPageVoteDetailVO
    }
}
