from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PasswordResetRequestForm, PlusApiResultVoid

class AuthApi:
    """auth API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def request_password_reset_challenge(self, body: PasswordResetRequestForm) -> PlusApiResultVoid:
        """Request password reset challenge"""
        return self._client.post(f"/app/v3/api/auth/password/reset/request", json=body)
