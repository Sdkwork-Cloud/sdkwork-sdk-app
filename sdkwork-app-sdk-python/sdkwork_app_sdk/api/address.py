from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListUserAddressVO, PlusApiResultUserAddressVO, PlusApiResultVoid, UserAddressCreateForm, UserAddressUpdateForm

class AddressApi:
    """address API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_address_detail(self, addressId: str) -> PlusApiResultUserAddressVO:
        """获取地址详情"""
        return self._client.get(f"/app/v3/api/user/address/{addressId}")

    def update_address(self, addressId: str, body: UserAddressUpdateForm) -> PlusApiResultUserAddressVO:
        """更新地址"""
        return self._client.put(f"/app/v3/api/user/address/{addressId}", json=body)

    def delete_address(self, addressId: str) -> PlusApiResultVoid:
        """删除地址"""
        return self._client.delete(f"/app/v3/api/user/address/{addressId}")

    def set_default(self, addressId: str) -> PlusApiResultUserAddressVO:
        """设置默认地址"""
        return self._client.put(f"/app/v3/api/user/address/{addressId}/default")

    def list_addresses(self) -> PlusApiResultListUserAddressVO:
        """获取地址列表"""
        return self._client.get(f"/app/v3/api/user/address")

    def create_address(self, body: UserAddressCreateForm) -> PlusApiResultUserAddressVO:
        """创建地址"""
        return self._client.post(f"/app/v3/api/user/address", json=body)

    def get_default(self) -> PlusApiResultUserAddressVO:
        """获取默认地址"""
        return self._client.get(f"/app/v3/api/user/address/default")
