package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class VoteApi(private val client: HttpClient) {

    /** 投票 */
    suspend fun vote(body: VoteForm): PlusApiResultVoteVO? {
        return client.post(ApiPaths.appPath("/vote"), body) as? PlusApiResultVoteVO
    }

    /** 取消投票 */
    suspend fun cancel(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/vote"), params) as? PlusApiResultVoid
    }

    /** 切换投票 */
    suspend fun toggle(body: VoteForm): PlusApiResultVoteVO? {
        return client.post(ApiPaths.appPath("/vote/toggle"), body) as? PlusApiResultVoteVO
    }

    /** 点赞 */
    suspend fun like(params: Map<String, Any>? = null): PlusApiResultVoteVO? {
        return client.post(ApiPaths.appPath("/vote/like"), null, params) as? PlusApiResultVoteVO
    }

    /** 点踩 */
    suspend fun dislike(params: Map<String, Any>? = null): PlusApiResultVoteVO? {
        return client.post(ApiPaths.appPath("/vote/dislike"), null, params) as? PlusApiResultVoteVO
    }

    /** 获取投票详情 */
    suspend fun getVoteDetail(voteId: String): PlusApiResultVoteDetailVO? {
        return client.get(ApiPaths.appPath("/vote/$voteId")) as? PlusApiResultVoteDetailVO
    }

    /** 获取热门内容 */
    suspend fun getTopLikedContent(params: Map<String, Any>? = null): PlusApiResultListLong? {
        return client.get(ApiPaths.appPath("/vote/top-liked"), params) as? PlusApiResultListLong
    }

    /** 获取投票状态 */
    suspend fun getVoteStatus(params: Map<String, Any>? = null): PlusApiResultVoteStatusVO? {
        return client.get(ApiPaths.appPath("/vote/status"), params) as? PlusApiResultVoteStatusVO
    }

    /** 获取投票统计 */
    suspend fun getVoteStatistics(params: Map<String, Any>? = null): PlusApiResultVoteStatisticsVO? {
        return client.get(ApiPaths.appPath("/vote/statistics"), params) as? PlusApiResultVoteStatisticsVO
    }

    /** 获取我的投票历史 */
    suspend fun getMyVotes(params: Map<String, Any>? = null): PlusApiResultPageVoteDetailVO? {
        return client.get(ApiPaths.appPath("/vote/my-votes"), params) as? PlusApiResultPageVoteDetailVO
    }
}
