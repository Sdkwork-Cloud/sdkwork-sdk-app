from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CommentCreateForm, CommentReplyForm, PlusApiResultCommentDetailVO, PlusApiResultCommentStatisticsVO, PlusApiResultCommentVO, PlusApiResultPageCommentVO, PlusApiResultVoid

class CommentsApi:
    """comments API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_comment(self, body: CommentCreateForm) -> PlusApiResultCommentVO:
        """发表评论"""
        return self._client.post(f"/app/v3/api/comments", json=body)

    def reply_comment(self, commentId: str, body: CommentReplyForm) -> PlusApiResultCommentVO:
        """回复评论"""
        return self._client.post(f"/app/v3/api/comments/{commentId}/reply", json=body)

    def pin_comment(self, commentId: str) -> PlusApiResultCommentVO:
        """置顶评论"""
        return self._client.post(f"/app/v3/api/comments/{commentId}/pin")

    def unpin_comment(self, commentId: str) -> PlusApiResultCommentVO:
        """取消置顶"""
        return self._client.delete(f"/app/v3/api/comments/{commentId}/pin")

    def like_comment(self, commentId: str) -> PlusApiResultCommentVO:
        """点赞评论"""
        return self._client.post(f"/app/v3/api/comments/{commentId}/like")

    def unlike_comment(self, commentId: str) -> PlusApiResultCommentVO:
        """取消点赞"""
        return self._client.delete(f"/app/v3/api/comments/{commentId}/like")

    def get_comment_detail(self, commentId: str) -> PlusApiResultCommentDetailVO:
        """获取评论详情"""
        return self._client.get(f"/app/v3/api/comments/{commentId}")

    def delete_comment(self, commentId: str) -> PlusApiResultVoid:
        """删除评论"""
        return self._client.delete(f"/app/v3/api/comments/{commentId}")

    def get_replies(self, commentId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCommentVO:
        """获取回复列表"""
        return self._client.get(f"/app/v3/api/comments/{commentId}/replies", params=params)

    def get_comment_statistics(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultCommentStatisticsVO:
        """获取评论统计"""
        return self._client.get(f"/app/v3/api/comments/statistics", params=params)

    def get_my(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCommentVO:
        """获取我的评论"""
        return self._client.get(f"/app/v3/api/comments/my", params=params)

    def get_comments(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCommentVO:
        """获取评论列表"""
        return self._client.get(f"/app/v3/api/comments/list", params=params)
