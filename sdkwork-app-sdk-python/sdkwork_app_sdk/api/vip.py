from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultInviteRulesVO, PlusApiResultListVipBenefitVO, PlusApiResultListVipCouponVO, PlusApiResultListVipInviteRecordVO, PlusApiResultListVipLevelVO, PlusApiResultListVipPackGroupVO, PlusApiResultListVipPackVO, PlusApiResultListVipPointsHistoryVO, PlusApiResultLong, PlusApiResultVipDailyRewardStatusVO, PlusApiResultVipDailyRewardVO, PlusApiResultVipInfoVO, PlusApiResultVipInviteInfoVO, PlusApiResultVipInviteVO, PlusApiResultVipPackDetailVO, PlusApiResultVipPackGroupDetailVO, PlusApiResultVipPrivilegeUsageVO, PlusApiResultVipPurchaseVO, PlusApiResultVipStatusVO, PlusApiResultVoid, SpeedUpForm, VipInviteForm, VipPurchaseForm, VipRenewForm, VipUpgradeForm

class VipApi:
    """vip API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def purchase(self, body: VipPurchaseForm) -> PlusApiResultVipPurchaseVO:
        """购买VIP"""
        return self._client.post(f"/app/v3/api/vip/purchase", json=body)

    def upgrade(self, body: VipUpgradeForm) -> PlusApiResultVipPurchaseVO:
        """升级VIP"""
        return self._client.post(f"/app/v3/api/vip/purchase/upgrade", json=body)

    def renew(self, body: VipRenewForm) -> PlusApiResultVipPurchaseVO:
        """续费VIP"""
        return self._client.post(f"/app/v3/api/vip/purchase/renew", json=body)

    def use_speed_up_privilege(self, body: SpeedUpForm) -> PlusApiResultVoid:
        """使用加速特权"""
        return self._client.post(f"/app/v3/api/vip/privilege/speed-up", json=body)

    def claim_daily_reward(self) -> PlusApiResultVipDailyRewardVO:
        """领取每日奖励"""
        return self._client.post(f"/app/v3/api/vip/points/daily-reward")

    def invite_friend(self, body: VipInviteForm) -> PlusApiResultVipInviteVO:
        """邀请好友"""
        return self._client.post(f"/app/v3/api/vip/invite", json=body)

    def claim_coupon(self, couponId: str) -> PlusApiResultVoid:
        """领取优惠券"""
        return self._client.post(f"/app/v3/api/vip/coupons/{couponId}/claim")

    def get_vip_status(self) -> PlusApiResultVipStatusVO:
        """获取VIP状态"""
        return self._client.get(f"/app/v3/api/vip/status")

    def get_privilege_usage(self) -> PlusApiResultVipPrivilegeUsageVO:
        """获取特权使用情况"""
        return self._client.get(f"/app/v3/api/vip/privilege/usage")

    def get_points_history(self) -> PlusApiResultListVipPointsHistoryVO:
        """获取积分明细"""
        return self._client.get(f"/app/v3/api/vip/points/history")

    def get_daily_reward_status(self) -> PlusApiResultVipDailyRewardStatusVO:
        """获取每日奖励状态"""
        return self._client.get(f"/app/v3/api/vip/points/daily-reward/status")

    def get_points_balance(self) -> PlusApiResultLong:
        """获取积分余额"""
        return self._client.get(f"/app/v3/api/vip/points/balance")

    def list_pack_groups(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListVipPackGroupVO:
        """获取套餐分组列表"""
        return self._client.get(f"/app/v3/api/vip/pack-groups", params=params)

    def get_pack_group_detail(self, groupId: str) -> PlusApiResultVipPackGroupDetailVO:
        """获取分组详情"""
        return self._client.get(f"/app/v3/api/vip/pack-groups/{groupId}")

    def list_packs_by_group(self, groupId: str) -> PlusApiResultListVipPackVO:
        """获取分组套餐"""
        return self._client.get(f"/app/v3/api/vip/pack-groups/{groupId}/packs")

    def list_all_packs(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListVipPackVO:
        """获取所有套餐"""
        return self._client.get(f"/app/v3/api/vip/pack-groups/packs", params=params)

    def get_pack_detail(self, packId: str) -> PlusApiResultVipPackDetailVO:
        """获取套餐详情"""
        return self._client.get(f"/app/v3/api/vip/pack-groups/packs/{packId}")

    def compare_packs(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListVipPackGroupVO:
        """对比套餐"""
        return self._client.get(f"/app/v3/api/vip/pack-groups/compare", params=params)

    def list_vip_levels(self) -> PlusApiResultListVipLevelVO:
        """获取VIP等级列表"""
        return self._client.get(f"/app/v3/api/vip/levels")

    def get_invite_rules(self) -> PlusApiResultInviteRulesVO:
        """获取邀请规则"""
        return self._client.get(f"/app/v3/api/vip/invite/rules")

    def get_invite_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListVipInviteRecordVO:
        """获取邀请记录"""
        return self._client.get(f"/app/v3/api/vip/invite/records", params=params)

    def get_invite_info(self) -> PlusApiResultVipInviteInfoVO:
        """获取邀请信息"""
        return self._client.get(f"/app/v3/api/vip/invite/info")

    def get_vip_info(self) -> PlusApiResultVipInfoVO:
        """获取VIP信息"""
        return self._client.get(f"/app/v3/api/vip/info")

    def list_vip_coupons(self) -> PlusApiResultListVipCouponVO:
        """获取VIP优惠券"""
        return self._client.get(f"/app/v3/api/vip/coupons")

    def list_my_coupons(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListVipCouponVO:
        """获取我的优惠券"""
        return self._client.get(f"/app/v3/api/vip/coupons/my", params=params)

    def check_vip_status(self) -> PlusApiResultBoolean:
        """检查VIP状态"""
        return self._client.get(f"/app/v3/api/vip/check")

    def list_vip_benefits(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListVipBenefitVO:
        """获取VIP权益"""
        return self._client.get(f"/app/v3/api/vip/benefits", params=params)
