from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ActivityJoinForm, CheckInMakeUpForm, PlusApiResultActivityDetailVO, PlusApiResultActivityJoinVO, PlusApiResultCheckInMakeUpVO, PlusApiResultCheckInStatusVO, PlusApiResultCheckInVO, PlusApiResultListCheckInRecordVO, PlusApiResultListLotteryActivityVO, PlusApiResultListTaskVO, PlusApiResultLotteryDetailVO, PlusApiResultLotteryDrawVO, PlusApiResultPageActivityRecordVO, PlusApiResultPageActivityVO, PlusApiResultPageLotteryPrizeVO, PlusApiResultPagePointsExchangeRecordVO, PlusApiResultPagePointsGoodsVO, PlusApiResultPointsExchangeVO, PlusApiResultPointsGoodsDetailVO, PlusApiResultPrizeClaimVO, PlusApiResultRankInfoVO, PlusApiResultRankingVO, PlusApiResultTaskRewardVO, PointsExchangeForm

class ActivityApi:
    """activity API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def join(self, activityId: str, body: ActivityJoinForm) -> PlusApiResultActivityJoinVO:
        """参与活动"""
        return self._client.post(f"/app/v3/api/activity/{activityId}/join", json=body)

    def claim_task_reward(self, taskId: str) -> PlusApiResultTaskRewardVO:
        """领取任务奖励"""
        return self._client.post(f"/app/v3/api/activity/tasks/{taskId}/claim")

    def exchange_goods(self, goodsId: str, body: PointsExchangeForm) -> PlusApiResultPointsExchangeVO:
        """兑换商品"""
        return self._client.post(f"/app/v3/api/activity/points-store/goods/{goodsId}/exchange", json=body)

    def draw_lottery(self, lotteryId: str) -> PlusApiResultLotteryDrawVO:
        """抽奖"""
        return self._client.post(f"/app/v3/api/activity/lottery/{lotteryId}/draw")

    def claim_prize(self, prizeId: str) -> PlusApiResultPrizeClaimVO:
        """领取奖品"""
        return self._client.post(f"/app/v3/api/activity/lottery/prizes/{prizeId}/claim")

    def check_in(self) -> PlusApiResultCheckInVO:
        """每日签到"""
        return self._client.post(f"/app/v3/api/activity/check-in")

    def make_up_check_in(self, body: CheckInMakeUpForm) -> PlusApiResultCheckInMakeUpVO:
        """补签"""
        return self._client.post(f"/app/v3/api/activity/check-in/make-up", json=body)

    def get_activity_detail(self, activityId: str) -> PlusApiResultActivityDetailVO:
        """获取活动详情"""
        return self._client.get(f"/app/v3/api/activity/{activityId}")

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/activity/tasks", params=params)

    def get_activity_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageActivityRecordVO:
        """获取参与记录"""
        return self._client.get(f"/app/v3/api/activity/records", params=params)

    def get_ranking(self, type: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultRankingVO:
        """获取排行榜"""
        return self._client.get(f"/app/v3/api/activity/rankings/{type}", params=params)

    def get_my_rank(self, type: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultRankInfoVO:
        """获取我的排名"""
        return self._client.get(f"/app/v3/api/activity/rankings/{type}/my-rank", params=params)

    def list_points_goods(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePointsGoodsVO:
        """获取积分商品"""
        return self._client.get(f"/app/v3/api/activity/points-store/goods", params=params)

    def get_points_goods_detail(self, goodsId: str) -> PlusApiResultPointsGoodsDetailVO:
        """获取商品详情"""
        return self._client.get(f"/app/v3/api/activity/points-store/goods/{goodsId}")

    def get_exchange_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePointsExchangeRecordVO:
        """获取兑换记录"""
        return self._client.get(f"/app/v3/api/activity/points-store/exchange-records", params=params)

    def get_lottery_detail(self, lotteryId: str) -> PlusApiResultLotteryDetailVO:
        """获取抽奖详情"""
        return self._client.get(f"/app/v3/api/activity/lottery/{lotteryId}")

    def get_my_prizes(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageLotteryPrizeVO:
        """获取中奖记录"""
        return self._client.get(f"/app/v3/api/activity/lottery/my-prizes", params=params)

    def list_lottery_activities(self) -> PlusApiResultListLotteryActivityVO:
        """获取抽奖列表"""
        return self._client.get(f"/app/v3/api/activity/lottery/list")

    def list_activities(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageActivityVO:
        """获取活动列表"""
        return self._client.get(f"/app/v3/api/activity/list", params=params)

    def get_check_in_status(self) -> PlusApiResultCheckInStatusVO:
        """获取签到状态"""
        return self._client.get(f"/app/v3/api/activity/check-in/status")

    def get_check_in_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListCheckInRecordVO:
        """获取签到记录"""
        return self._client.get(f"/app/v3/api/activity/check-in/records", params=params)
