from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AdvertClickForm, AdvertCloseForm, AdvertImpressionForm, AdvertReportForm, AdvertSettingsUpdateForm, PlusApiResultAdvertConfigVO, PlusApiResultAdvertPositionDetailVO, PlusApiResultAdvertSettingsVO, PlusApiResultInterstitialAdvertVO, PlusApiResultListAdvertPositionVO, PlusApiResultListAdvertVO, PlusApiResultListBannerAdvertVO, PlusApiResultListFeedAdvertVO, PlusApiResultPopupAdvertVO, PlusApiResultRewardedAdvertVO, PlusApiResultRewardVerifyVO, PlusApiResultSplashAdvertVO, PlusApiResultVoid, RewardVerifyForm, VideoCompleteForm, VideoProgressForm

class AdvertApi:
    """advert API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_advert_settings(self) -> PlusApiResultAdvertSettingsVO:
        """广告设置"""
        return self._client.get(f"/app/v3/api/advert/settings")

    def update_advert_settings(self, body: AdvertSettingsUpdateForm) -> PlusApiResultVoid:
        """更新广告设置"""
        return self._client.put(f"/app/v3/api/advert/settings", json=body)

    def report(self, adId: str, body: AdvertReportForm) -> PlusApiResultVoid:
        """广告反馈"""
        return self._client.post(f"/app/v3/api/advert/{adId}/report", json=body)

    def track_video_progress(self, adId: str, body: VideoProgressForm) -> PlusApiResultVoid:
        """上报播放进度"""
        return self._client.post(f"/app/v3/api/advert/{adId}/progress", json=body)

    def track_impression(self, adId: str, body: AdvertImpressionForm) -> PlusApiResultVoid:
        """上报展示"""
        return self._client.post(f"/app/v3/api/advert/{adId}/impression", json=body)

    def track_video_complete(self, adId: str, body: VideoCompleteForm) -> PlusApiResultVoid:
        """上报播放完成"""
        return self._client.post(f"/app/v3/api/advert/{adId}/complete", json=body)

    def track_close(self, adId: str, body: AdvertCloseForm) -> PlusApiResultVoid:
        """上报关闭"""
        return self._client.post(f"/app/v3/api/advert/{adId}/close", json=body)

    def track_click(self, adId: str, body: AdvertClickForm) -> PlusApiResultVoid:
        """上报点击"""
        return self._client.post(f"/app/v3/api/advert/{adId}/click", json=body)

    def block(self, adId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """屏蔽广告"""
        return self._client.post(f"/app/v3/api/advert/{adId}/block", params=params)

    def verify_reward(self, body: RewardVerifyForm) -> PlusApiResultRewardVerifyVO:
        """验证奖励"""
        return self._client.post(f"/app/v3/api/advert/rewarded/verify", json=body)

    def get_splash(self) -> PlusApiResultSplashAdvertVO:
        """开屏广告"""
        return self._client.get(f"/app/v3/api/advert/splash")

    def get_rewarded(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultRewardedAdvertVO:
        """激励视频广告"""
        return self._client.get(f"/app/v3/api/advert/rewarded", params=params)

    def list_advert_positions(self) -> PlusApiResultListAdvertPositionVO:
        """广告位列表"""
        return self._client.get(f"/app/v3/api/advert/positions")

    def get_advert_position(self, positionId: str) -> PlusApiResultAdvertPositionDetailVO:
        """广告位详情"""
        return self._client.get(f"/app/v3/api/advert/positions/{positionId}")

    def get_ads_by_position(self, positionId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListAdvertVO:
        """获取位置广告"""
        return self._client.get(f"/app/v3/api/advert/positions/{positionId}/ads", params=params)

    def get_popup(self) -> PlusApiResultPopupAdvertVO:
        """弹窗广告"""
        return self._client.get(f"/app/v3/api/advert/popup")

    def get_interstitial(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultInterstitialAdvertVO:
        """插屏广告"""
        return self._client.get(f"/app/v3/api/advert/interstitial", params=params)

    def get_feed_adverts(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedAdvertVO:
        """信息流广告"""
        return self._client.get(f"/app/v3/api/advert/feed", params=params)

    def get_advert_config(self) -> PlusApiResultAdvertConfigVO:
        """广告配置"""
        return self._client.get(f"/app/v3/api/advert/config")

    def get_banner_adverts(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListBannerAdvertVO:
        """Banner广告"""
        return self._client.get(f"/app/v3/api/advert/banner", params=params)
