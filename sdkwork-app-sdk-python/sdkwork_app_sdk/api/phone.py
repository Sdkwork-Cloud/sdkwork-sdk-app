from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PhoneLoginForm, PlusApiResultLoginVO

class PhoneApi:
    """phone API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def login(self, body: PhoneLoginForm) -> PlusApiResultLoginVO:
        """手机号验证码登录"""
        return self._client.post(f"/app/v3/api/auth/phone/login", json=body)
