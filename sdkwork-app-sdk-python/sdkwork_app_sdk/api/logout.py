from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultVoid

class LogoutApi:
    """logout API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def logout(self) -> PlusApiResultVoid:
        """用户登出"""
        return self._client.post(f"/app/v3/api/auth/logout")
