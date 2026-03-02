from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultVoid, ThirdPartyBindForm

class BindApi:
    """bind API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def third_party_account(self, platform: str, body: ThirdPartyBindForm) -> PlusApiResultVoid:
        """绑定第三方账号"""
        return self._client.post(f"/app/v3/api/user/bind/{platform}", json=body)

    def unbind_third_party_account(self, platform: str) -> PlusApiResultVoid:
        """解绑第三方账号"""
        return self._client.delete(f"/app/v3/api/user/bind/{platform}")
