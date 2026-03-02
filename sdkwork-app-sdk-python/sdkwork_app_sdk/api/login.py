from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import LoginForm, PlusApiResultLoginVO

class LoginApi:
    """login API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def login(self, body: LoginForm) -> PlusApiResultLoginVO:
        """用户登录"""
        return self._client.post(f"/app/v3/api/auth/login", json=body)
