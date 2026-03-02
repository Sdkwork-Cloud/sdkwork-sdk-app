from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CommissionForm, PartnerCreateForm, PartnerUpdateForm, PlusApiResultPagePartnerVO, PlusApiResultPartnerDetailVO, PlusApiResultPartnerStatisticsVO, PlusApiResultPartnerVO, PlusApiResultVoid

class PartnerApi:
    """partner API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_partner(self, partnerId: str) -> PlusApiResultPartnerDetailVO:
        """获取合作伙伴详情"""
        return self._client.get(f"/app/v3/api/partner/{partnerId}")

    def update_partner(self, partnerId: str, body: PartnerUpdateForm) -> PlusApiResultPartnerVO:
        """更新合作伙伴"""
        return self._client.put(f"/app/v3/api/partner/{partnerId}", json=body)

    def delete_partner(self, partnerId: str) -> PlusApiResultVoid:
        """删除合作伙伴"""
        return self._client.delete(f"/app/v3/api/partner/{partnerId}")

    def create_partner(self, body: PartnerCreateForm) -> PlusApiResultPartnerVO:
        """申请成为合作伙伴"""
        return self._client.post(f"/app/v3/api/partner", json=body)

    def withdraw_commission(self, partnerId: str, body: CommissionForm) -> PlusApiResultVoid:
        """提现佣金"""
        return self._client.post(f"/app/v3/api/partner/{partnerId}/withdraw", json=body)

    def reject(self, partnerId: str) -> PlusApiResultVoid:
        """审批拒绝"""
        return self._client.post(f"/app/v3/api/partner/{partnerId}/reject")

    def add_commission(self, partnerId: str, body: CommissionForm) -> PlusApiResultVoid:
        """添加佣金"""
        return self._client.post(f"/app/v3/api/partner/{partnerId}/commission", json=body)

    def approve(self, partnerId: str) -> PlusApiResultVoid:
        """审批通过"""
        return self._client.post(f"/app/v3/api/partner/{partnerId}/approve")

    def get_subordinates(self, partnerId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePartnerVO:
        """获取下级合作伙伴"""
        return self._client.get(f"/app/v3/api/partner/subordinates/{partnerId}", params=params)

    def get_partner_statistics(self) -> PlusApiResultPartnerStatisticsVO:
        """获取合作伙伴统计"""
        return self._client.get(f"/app/v3/api/partner/statistics")

    def search_partners(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePartnerVO:
        """搜索合作伙伴"""
        return self._client.get(f"/app/v3/api/partner/search", params=params)

    def get_my(self) -> PlusApiResultPartnerDetailVO:
        """获取我的合作伙伴信息"""
        return self._client.get(f"/app/v3/api/partner/my")

    def get_by_promotion_code(self, promotionCode: str) -> PlusApiResultPartnerVO:
        """根据推广码查询"""
        return self._client.get(f"/app/v3/api/partner/code/{promotionCode}")
