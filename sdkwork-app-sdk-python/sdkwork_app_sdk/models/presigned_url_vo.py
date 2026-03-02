from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PresignedUrlVO:
    """预签名URL响应"""
    created_at: str = None
    updated_at: str = None
    url: str = None
    preview_url: str = None
    object_key: str = None
