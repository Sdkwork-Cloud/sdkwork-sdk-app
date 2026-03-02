from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UploadInitVO:
    """上传初始化响应"""
    created_at: str = None
    updated_at: str = None
    upload_id: str = None
    file_name: str = None
    file_size: int = None
    chunk_size: int = None
    total_chunks: int = None
    storage_path: str = None
    upload_url: str = None
    upload_params: Any = None
    uploaded_chunks: List[int] = None
    expire_time: int = None
    support_resume: bool = None
    upload_type: str = None
