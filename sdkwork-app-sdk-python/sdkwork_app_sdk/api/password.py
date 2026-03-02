from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PasswordChangeForm, PasswordResetForm, PlusApiResultVoid

class PasswordApi:
    """password API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def change(self, body: PasswordChangeForm) -> PlusApiResultVoid:
        """修改密码"""
        return self._client.put(f"/app/v3/api/user/password", json=body)

    def reset(self, body: PasswordResetForm) -> PlusApiResultVoid:
        """重置密码"""
        return self._client.post(f"/app/v3/api/auth/password/reset", json=body)
