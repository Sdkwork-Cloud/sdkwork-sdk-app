from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AccountDeactivateForm, PlusApiResultVoid

class DeactivateApi:
    """deactivate API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def account(self, body: AccountDeactivateForm) -> PlusApiResultVoid:
        """注销账号"""
        return self._client.post(f"/app/v3/api/user/deactivate", json=body)
