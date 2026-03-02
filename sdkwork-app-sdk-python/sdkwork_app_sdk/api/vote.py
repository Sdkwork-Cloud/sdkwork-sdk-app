from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListLong, PlusApiResultPageVoteDetailVO, PlusApiResultVoid, PlusApiResultVoteDetailVO, PlusApiResultVoteStatisticsVO, PlusApiResultVoteStatusVO, PlusApiResultVoteVO, VoteForm

class VoteApi:
    """vote API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def vote(self, body: VoteForm) -> PlusApiResultVoteVO:
        """投票"""
        return self._client.post(f"/app/v3/api/vote", json=body)

    def cancel(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """取消投票"""
        return self._client.delete(f"/app/v3/api/vote", params=params)

    def toggle(self, body: VoteForm) -> PlusApiResultVoteVO:
        """切换投票"""
        return self._client.post(f"/app/v3/api/vote/toggle", json=body)

    def like(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoteVO:
        """点赞"""
        return self._client.post(f"/app/v3/api/vote/like", params=params)

    def dislike(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoteVO:
        """点踩"""
        return self._client.post(f"/app/v3/api/vote/dislike", params=params)

    def get_vote_detail(self, voteId: str) -> PlusApiResultVoteDetailVO:
        """获取投票详情"""
        return self._client.get(f"/app/v3/api/vote/{voteId}")

    def get_top_liked_content(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListLong:
        """获取热门内容"""
        return self._client.get(f"/app/v3/api/vote/top-liked", params=params)

    def get_vote_status(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoteStatusVO:
        """获取投票状态"""
        return self._client.get(f"/app/v3/api/vote/status", params=params)

    def get_vote_statistics(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoteStatisticsVO:
        """获取投票统计"""
        return self._client.get(f"/app/v3/api/vote/statistics", params=params)

    def get_my_votes(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVoteDetailVO:
        """获取我的投票历史"""
        return self._client.get(f"/app/v3/api/vote/my-votes", params=params)
