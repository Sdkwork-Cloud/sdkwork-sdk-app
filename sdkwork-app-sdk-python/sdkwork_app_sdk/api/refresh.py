from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultLoginVO, TokenRefreshForm

class RefreshApi:
    """refresh API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def token(self, body: TokenRefreshForm) -> PlusApiResultLoginVO:
        """刷新令牌"""
        return self._client.post(f"/app/v3/api/auth/refresh", json=body)
