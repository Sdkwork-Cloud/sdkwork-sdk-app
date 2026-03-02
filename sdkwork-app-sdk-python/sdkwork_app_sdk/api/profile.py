from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultUserProfileVO, UserProfileUpdateForm

class ProfileApi:
    """profile API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_user(self) -> PlusApiResultUserProfileVO:
        """获取用户信息"""
        return self._client.get(f"/app/v3/api/user/profile")

    def update_user(self, body: UserProfileUpdateForm) -> PlusApiResultUserProfileVO:
        """更新用户信息"""
        return self._client.put(f"/app/v3/api/user/profile", json=body)
