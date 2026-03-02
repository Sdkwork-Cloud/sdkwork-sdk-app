from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OAuthAuthUrlForm, OAuthLoginForm, PlusApiResultLoginVO, PlusApiResultOAuthUrlVO

class OauthApi:
    """oauth API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_oauth_url(self, body: OAuthAuthUrlForm) -> PlusApiResultOAuthUrlVO:
        """OAuth授权URL"""
        return self._client.post(f"/app/v3/api/auth/oauth/url", json=body)

    def login(self, body: OAuthLoginForm) -> PlusApiResultLoginVO:
        """OAuth登录"""
        return self._client.post(f"/app/v3/api/auth/oauth/login", json=body)
