from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListTenantTypeVO, PlusApiResultPageTenantVO, PlusApiResultTenantDetailVO, PlusApiResultTenantStatisticsVO, PlusApiResultTenantVO, TenantCreateForm, TenantUpdateForm

class TenantApi:
    """tenant API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_tenant(self, tenantId: str) -> PlusApiResultTenantDetailVO:
        """获取租户详情"""
        return self._client.get(f"/app/v3/api/tenant/{tenantId}")

    def update_tenant(self, tenantId: str, body: TenantUpdateForm) -> PlusApiResultTenantVO:
        """更新租户"""
        return self._client.put(f"/app/v3/api/tenant/{tenantId}", json=body)

    def create_tenant(self, body: TenantCreateForm) -> PlusApiResultTenantVO:
        """创建租户"""
        return self._client.post(f"/app/v3/api/tenant", json=body)

    def freeze(self, tenantId: str) -> PlusApiResultTenantVO:
        """冻结租户"""
        return self._client.post(f"/app/v3/api/tenant/{tenantId}/freeze")

    def close(self, tenantId: str) -> PlusApiResultTenantVO:
        """注销租户"""
        return self._client.post(f"/app/v3/api/tenant/{tenantId}/close")

    def activate(self, tenantId: str) -> PlusApiResultTenantVO:
        """激活租户"""
        return self._client.post(f"/app/v3/api/tenant/{tenantId}/activate")

    def get_tenant_types(self) -> PlusApiResultListTenantTypeVO:
        """获取租户类型列表"""
        return self._client.get(f"/app/v3/api/tenant/types")

    def get_tenant_statistics(self) -> PlusApiResultTenantStatisticsVO:
        """获取租户统计"""
        return self._client.get(f"/app/v3/api/tenant/statistics")

    def get_root(self) -> PlusApiResultTenantDetailVO:
        """获取根租户"""
        return self._client.get(f"/app/v3/api/tenant/root")

    def get_tenant_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageTenantVO:
        """获取租户列表"""
        return self._client.get(f"/app/v3/api/tenant/list", params=params)

    def get_tenant_by_code(self, code: str) -> PlusApiResultTenantDetailVO:
        """根据编码获取租户"""
        return self._client.get(f"/app/v3/api/tenant/code/{code}")

    def get_cloud(self) -> PlusApiResultTenantDetailVO:
        """获取云租户"""
        return self._client.get(f"/app/v3/api/tenant/cloud")
