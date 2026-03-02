package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CommentsApi {
    private final HttpClient client;
    
    public CommentsApi(HttpClient client) {
        this.client = client;
    }

    /** 发表评论 */
    public PlusApiResultCommentVO createComment(CommentCreateForm body) throws Exception {
        return (PlusApiResultCommentVO) client.post(ApiPaths.appPath("/comments"), body);
    }

    /** 回复评论 */
    public PlusApiResultCommentVO replyComment(String commentId, CommentReplyForm body) throws Exception {
        return (PlusApiResultCommentVO) client.post(ApiPaths.appPath("/comments/" + commentId + "/reply"), body);
    }

    /** 置顶评论 */
    public PlusApiResultCommentVO pinComment(String commentId) throws Exception {
        return (PlusApiResultCommentVO) client.post(ApiPaths.appPath("/comments/" + commentId + "/pin"), null);
    }

    /** 取消置顶 */
    public PlusApiResultCommentVO unpinComment(String commentId) throws Exception {
        return (PlusApiResultCommentVO) client.delete(ApiPaths.appPath("/comments/" + commentId + "/pin"));
    }

    /** 点赞评论 */
    public PlusApiResultCommentVO likeComment(String commentId) throws Exception {
        return (PlusApiResultCommentVO) client.post(ApiPaths.appPath("/comments/" + commentId + "/like"), null);
    }

    /** 取消点赞 */
    public PlusApiResultCommentVO unlikeComment(String commentId) throws Exception {
        return (PlusApiResultCommentVO) client.delete(ApiPaths.appPath("/comments/" + commentId + "/like"));
    }

    /** 获取评论详情 */
    public PlusApiResultCommentDetailVO getCommentDetail(String commentId) throws Exception {
        return (PlusApiResultCommentDetailVO) client.get(ApiPaths.appPath("/comments/" + commentId + ""));
    }

    /** 删除评论 */
    public PlusApiResultVoid deleteComment(String commentId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/comments/" + commentId + ""));
    }

    /** 获取回复列表 */
    public PlusApiResultPageCommentVO getReplies(String commentId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCommentVO) client.get(ApiPaths.appPath("/comments/" + commentId + "/replies"), params);
    }

    /** 获取评论统计 */
    public PlusApiResultCommentStatisticsVO getCommentStatistics(Map<String, Object> params) throws Exception {
        return (PlusApiResultCommentStatisticsVO) client.get(ApiPaths.appPath("/comments/statistics"), params);
    }

    /** 获取我的评论 */
    public PlusApiResultPageCommentVO getMy(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCommentVO) client.get(ApiPaths.appPath("/comments/my"), params);
    }

    /** 获取评论列表 */
    public PlusApiResultPageCommentVO getComments(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCommentVO) client.get(ApiPaths.appPath("/comments/list"), params);
    }
}
