from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CouponPointsExchangeForm, CouponRedeemForm, CouponRollbackForm, PlusApiResultCouponStatisticsVO, PlusApiResultCouponVO, PlusApiResultPageCouponVO, PlusApiResultPageUserCouponVO, PlusApiResultUserCouponVO

class CouponsApi:
    """coupons API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def receive_coupon(self, couponId: str) -> PlusApiResultUserCouponVO:
        """领取优惠券"""
        return self._client.post(f"/app/v3/api/coupons/{couponId}/receive")

    def exchange_coupon_by_points(self, couponId: str, body: CouponPointsExchangeForm) -> PlusApiResultUserCouponVO:
        """积分兑换优惠券"""
        return self._client.post(f"/app/v3/api/coupons/{couponId}/exchange/points", json=body)

    def redeem_coupon(self, body: CouponRedeemForm) -> PlusApiResultUserCouponVO:
        """兑换优惠券"""
        return self._client.post(f"/app/v3/api/coupons/redeem", json=body)

    def use_coupon(self, userCouponId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUserCouponVO:
        """使用优惠券"""
        return self._client.post(f"/app/v3/api/coupons/my/{userCouponId}/use", params=params)

    def rollback_points_exchange_coupon(self, userCouponId: str, body: Optional[CouponRollbackForm] = None) -> PlusApiResultUserCouponVO:
        """回滚积分兑换优惠券"""
        return self._client.post(f"/app/v3/api/coupons/my/{userCouponId}/rollback", json=body)

    def cancel_use_coupon(self, userCouponId: str) -> PlusApiResultUserCouponVO:
        """取消使用优惠券"""
        return self._client.post(f"/app/v3/api/coupons/my/{userCouponId}/cancel")

    def list_coupons(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCouponVO:
        """获取可领取优惠券列表"""
        return self._client.get(f"/app/v3/api/coupons", params=params)

    def get_coupon_detail(self, couponId: str) -> PlusApiResultCouponVO:
        """获取优惠券详情"""
        return self._client.get(f"/app/v3/api/coupons/{couponId}")

    def get_statistics(self) -> PlusApiResultCouponStatisticsVO:
        """获取优惠券统计"""
        return self._client.get(f"/app/v3/api/coupons/statistics")

    def get_my(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageUserCouponVO:
        """获取我的优惠券列表"""
        return self._client.get(f"/app/v3/api/coupons/my", params=params)

    def get_user_coupon_detail(self, userCouponId: str) -> PlusApiResultUserCouponVO:
        """获取用户优惠券详情"""
        return self._client.get(f"/app/v3/api/coupons/my/{userCouponId}")

    def get_available(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageUserCouponVO:
        """获取可用优惠券列表"""
        return self._client.get(f"/app/v3/api/coupons/my/available", params=params)
