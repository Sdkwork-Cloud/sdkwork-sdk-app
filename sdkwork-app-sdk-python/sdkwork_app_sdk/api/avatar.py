from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultMapStringString, UploadAvatarRequest

class AvatarApi:
    """avatar API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def upload(self, body: Optional[UploadAvatarRequest] = None) -> PlusApiResultMapStringString:
        """上传头像"""
        return self._client.post(f"/app/v3/api/user/avatar", json=body)
