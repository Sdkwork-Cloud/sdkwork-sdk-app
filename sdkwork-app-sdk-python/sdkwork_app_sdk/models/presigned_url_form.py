from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PresignedUrlForm:
    """预签名URL请求"""
    object_key: str = None
    bucket: str = None
    method: str = None
    expiration_seconds: int = None
