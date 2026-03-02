package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CommentsApi(private val client: HttpClient) {

    /** 发表评论 */
    suspend fun createComment(body: CommentCreateForm): PlusApiResultCommentVO? {
        return client.post(ApiPaths.appPath("/comments"), body) as? PlusApiResultCommentVO
    }

    /** 回复评论 */
    suspend fun replyComment(commentId: String, body: CommentReplyForm): PlusApiResultCommentVO? {
        return client.post(ApiPaths.appPath("/comments/$commentId/reply"), body) as? PlusApiResultCommentVO
    }

    /** 置顶评论 */
    suspend fun pinComment(commentId: String): PlusApiResultCommentVO? {
        return client.post(ApiPaths.appPath("/comments/$commentId/pin"), null) as? PlusApiResultCommentVO
    }

    /** 取消置顶 */
    suspend fun unpinComment(commentId: String): PlusApiResultCommentVO? {
        return client.delete(ApiPaths.appPath("/comments/$commentId/pin")) as? PlusApiResultCommentVO
    }

    /** 点赞评论 */
    suspend fun likeComment(commentId: String): PlusApiResultCommentVO? {
        return client.post(ApiPaths.appPath("/comments/$commentId/like"), null) as? PlusApiResultCommentVO
    }

    /** 取消点赞 */
    suspend fun unlikeComment(commentId: String): PlusApiResultCommentVO? {
        return client.delete(ApiPaths.appPath("/comments/$commentId/like")) as? PlusApiResultCommentVO
    }

    /** 获取评论详情 */
    suspend fun getCommentDetail(commentId: String): PlusApiResultCommentDetailVO? {
        return client.get(ApiPaths.appPath("/comments/$commentId")) as? PlusApiResultCommentDetailVO
    }

    /** 删除评论 */
    suspend fun deleteComment(commentId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/comments/$commentId")) as? PlusApiResultVoid
    }

    /** 获取回复列表 */
    suspend fun getReplies(commentId: String, params: Map<String, Any>? = null): PlusApiResultPageCommentVO? {
        return client.get(ApiPaths.appPath("/comments/$commentId/replies"), params) as? PlusApiResultPageCommentVO
    }

    /** 获取评论统计 */
    suspend fun getCommentStatistics(params: Map<String, Any>? = null): PlusApiResultCommentStatisticsVO? {
        return client.get(ApiPaths.appPath("/comments/statistics"), params) as? PlusApiResultCommentStatisticsVO
    }

    /** 获取我的评论 */
    suspend fun getMy(params: Map<String, Any>? = null): PlusApiResultPageCommentVO? {
        return client.get(ApiPaths.appPath("/comments/my"), params) as? PlusApiResultPageCommentVO
    }

    /** 获取评论列表 */
    suspend fun getComments(params: Map<String, Any>? = null): PlusApiResultPageCommentVO? {
        return client.get(ApiPaths.appPath("/comments/list"), params) as? PlusApiResultPageCommentVO
    }
}
