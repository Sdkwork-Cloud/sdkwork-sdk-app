from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UploadPolicyVO:
    """上传策略响应"""
    created_at: str = None
    updated_at: str = None
    bucket_name: str = None
    object_key_prefix: str = None
    expiration_time: str = None
    max_file_size: int = None
    min_file_size: int = None
    allowed_content_types: List[str] = None
    allow_overwrite: bool = None
    callback_url: str = None
