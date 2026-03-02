from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import InviteLinkForm, PlusApiResultInviteInfoVO, PlusApiResultInviteLinkVO, PlusApiResultInviteRewardClaimVO, PlusApiResultListSharePlatformVO, PlusApiResultPageInviteRecordVO, PlusApiResultPageShareRecordVO, PlusApiResultPageShareVisitorVO, PlusApiResultShareCreateVO, PlusApiResultShareInfoVO, PlusApiResultSharePosterVO, PlusApiResultShareRecordVO, PlusApiResultShareStatisticsVO, PlusApiResultShareVerifyVO, PlusApiResultVoid, ShareCreateForm, SharePosterForm, ShareTrackForm, ShareUpdateForm, ShareVerifyForm, ShareVisitForm

class ShareApi:
    """share API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update_share_settings(self, shareId: str, body: ShareUpdateForm) -> PlusApiResultShareRecordVO:
        """更新分享设置"""
        return self._client.put(f"/app/v3/api/share/{shareId}", json=body)

    def cancel(self, shareId: str) -> PlusApiResultVoid:
        """取消分享"""
        return self._client.delete(f"/app/v3/api/share/{shareId}")

    def create_share(self, body: ShareCreateForm) -> PlusApiResultShareCreateVO:
        """创建分享"""
        return self._client.post(f"/app/v3/api/share", json=body)

    def visit(self, shareCode: str, body: ShareVisitForm) -> PlusApiResultVoid:
        """访问分享"""
        return self._client.post(f"/app/v3/api/share/{shareCode}/visit", json=body)

    def verify_share_password(self, shareCode: str, body: ShareVerifyForm) -> PlusApiResultShareVerifyVO:
        """验证分享密码"""
        return self._client.post(f"/app/v3/api/share/{shareCode}/verify", json=body)

    def track(self, body: ShareTrackForm) -> PlusApiResultVoid:
        """上报分享"""
        return self._client.post(f"/app/v3/api/share/track", json=body)

    def generate_share_poster(self, body: SharePosterForm) -> PlusApiResultSharePosterVO:
        """生成分享海报"""
        return self._client.post(f"/app/v3/api/share/poster", json=body)

    def claim_invite_reward(self, rewardId: str) -> PlusApiResultInviteRewardClaimVO:
        """领取邀请奖励"""
        return self._client.post(f"/app/v3/api/share/invite/rewards/{rewardId}/claim")

    def generate_invite_link(self, body: InviteLinkForm) -> PlusApiResultInviteLinkVO:
        """生成邀请链接"""
        return self._client.post(f"/app/v3/api/share/invite/link", json=body)

    def get_share_visitors(self, shareId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageShareVisitorVO:
        """获取访问记录"""
        return self._client.get(f"/app/v3/api/share/{shareId}/visitors", params=params)

    def get_share_statistics(self, shareId: str) -> PlusApiResultShareStatisticsVO:
        """获取分享统计"""
        return self._client.get(f"/app/v3/api/share/{shareId}/statistics")

    def get_share_info(self, shareCode: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultShareInfoVO:
        """获取分享信息"""
        return self._client.get(f"/app/v3/api/share/{shareCode}", params=params)

    def get_share_platforms(self) -> PlusApiResultListSharePlatformVO:
        """获取分享平台配置"""
        return self._client.get(f"/app/v3/api/share/platforms")

    def list_my_shares(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageShareRecordVO:
        """获取我的分享"""
        return self._client.get(f"/app/v3/api/share/my-shares", params=params)

    def get_invite_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageInviteRecordVO:
        """获取邀请记录"""
        return self._client.get(f"/app/v3/api/share/invite/records", params=params)

    def get_invite_info(self) -> PlusApiResultInviteInfoVO:
        """获取邀请信息"""
        return self._client.get(f"/app/v3/api/share/invite/info")

    def batch_cancel_shares(self) -> PlusApiResultVoid:
        """批量取消分享"""
        return self._client.delete(f"/app/v3/api/share/batch")
