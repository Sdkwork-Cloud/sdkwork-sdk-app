from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UploadCredentialsVO:
    """上传凭证响应"""
    created_at: str = None
    updated_at: str = None
    access_key_id: str = None
    secret_access_key: str = None
    session_token: str = None
    expiration_time: str = None
    bucket: str = None
    region: str = None
