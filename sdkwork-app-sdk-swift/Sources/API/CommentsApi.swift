import Foundation

public class CommentsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 发表评论
    public func createComment(body: CommentCreateForm) async throws -> PlusApiResultCommentVO? {
        let response = try await client.post(ApiPaths.appPath("/comments"), body: body)
        return response as? PlusApiResultCommentVO
    }

    /// 回复评论
    public func replyComment(commentId: String, body: CommentReplyForm) async throws -> PlusApiResultCommentVO? {
        let response = try await client.post(ApiPaths.appPath("/comments/\(commentId)/reply"), body: body)
        return response as? PlusApiResultCommentVO
    }

    /// 置顶评论
    public func pinComment(commentId: String) async throws -> PlusApiResultCommentVO? {
        let response = try await client.post(ApiPaths.appPath("/comments/\(commentId)/pin"), body: nil)
        return response as? PlusApiResultCommentVO
    }

    /// 取消置顶
    public func unpinComment(commentId: String) async throws -> PlusApiResultCommentVO? {
        let response = try await client.delete(ApiPaths.appPath("/comments/\(commentId)/pin"))
        return response as? PlusApiResultCommentVO
    }

    /// 点赞评论
    public func likeComment(commentId: String) async throws -> PlusApiResultCommentVO? {
        let response = try await client.post(ApiPaths.appPath("/comments/\(commentId)/like"), body: nil)
        return response as? PlusApiResultCommentVO
    }

    /// 取消点赞
    public func unlikeComment(commentId: String) async throws -> PlusApiResultCommentVO? {
        let response = try await client.delete(ApiPaths.appPath("/comments/\(commentId)/like"))
        return response as? PlusApiResultCommentVO
    }

    /// 获取评论详情
    public func getCommentDetail(commentId: String) async throws -> PlusApiResultCommentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/comments/\(commentId)"))
        return response as? PlusApiResultCommentDetailVO
    }

    /// 删除评论
    public func deleteComment(commentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/comments/\(commentId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取回复列表
    public func getReplies(commentId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageCommentVO? {
        let response = try await client.get(ApiPaths.appPath("/comments/\(commentId)/replies"), params: params)
        return response as? PlusApiResultPageCommentVO
    }

    /// 获取评论统计
    public func getCommentStatistics(params: [String: Any]? = nil) async throws -> PlusApiResultCommentStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/comments/statistics"), params: params)
        return response as? PlusApiResultCommentStatisticsVO
    }

    /// 获取我的评论
    public func getMy(params: [String: Any]? = nil) async throws -> PlusApiResultPageCommentVO? {
        let response = try await client.get(ApiPaths.appPath("/comments/my"), params: params)
        return response as? PlusApiResultPageCommentVO
    }

    /// 获取评论列表
    public func getComments(params: [String: Any]? = nil) async throws -> PlusApiResultPageCommentVO? {
        let response = try await client.get(ApiPaths.appPath("/comments/list"), params: params)
        return response as? PlusApiResultPageCommentVO
    }
}
