package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class VoteApi {
    private final HttpClient client;
    
    public VoteApi(HttpClient client) {
        this.client = client;
    }

    /** 投票 */
    public PlusApiResultVoteVO vote(VoteForm body) throws Exception {
        return (PlusApiResultVoteVO) client.post(ApiPaths.appPath("/vote"), body);
    }

    /** 取消投票 */
    public PlusApiResultVoid cancel(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/vote"), params);
    }

    /** 切换投票 */
    public PlusApiResultVoteVO toggle(VoteForm body) throws Exception {
        return (PlusApiResultVoteVO) client.post(ApiPaths.appPath("/vote/toggle"), body);
    }

    /** 点赞 */
    public PlusApiResultVoteVO like(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoteVO) client.post(ApiPaths.appPath("/vote/like"), null, params);
    }

    /** 点踩 */
    public PlusApiResultVoteVO dislike(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoteVO) client.post(ApiPaths.appPath("/vote/dislike"), null, params);
    }

    /** 获取投票详情 */
    public PlusApiResultVoteDetailVO getVoteDetail(String voteId) throws Exception {
        return (PlusApiResultVoteDetailVO) client.get(ApiPaths.appPath("/vote/" + voteId + ""));
    }

    /** 获取热门内容 */
    public PlusApiResultListLong getTopLikedContent(Map<String, Object> params) throws Exception {
        return (PlusApiResultListLong) client.get(ApiPaths.appPath("/vote/top-liked"), params);
    }

    /** 获取投票状态 */
    public PlusApiResultVoteStatusVO getVoteStatus(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoteStatusVO) client.get(ApiPaths.appPath("/vote/status"), params);
    }

    /** 获取投票统计 */
    public PlusApiResultVoteStatisticsVO getVoteStatistics(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoteStatisticsVO) client.get(ApiPaths.appPath("/vote/statistics"), params);
    }

    /** 获取我的投票历史 */
    public PlusApiResultPageVoteDetailVO getMyVotes(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVoteDetailVO) client.get(ApiPaths.appPath("/vote/my-votes"), params);
    }
}
