from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultUserInfoVO, RegisterForm

class RegisterApi:
    """register API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def register(self, body: RegisterForm) -> PlusApiResultUserInfoVO:
        """用户注册"""
        return self._client.post(f"/app/v3/api/auth/register", json=body)
