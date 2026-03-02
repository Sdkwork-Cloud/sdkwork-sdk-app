from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UploadInitForm:
    """上传初始化请求"""
    file_name: str = None
    file_size: int = None
    file_md5: str = None
    file_type: str = None
    upload_type: str = None
    chunk_size: int = None
    total_chunks: int = None
    storage_path: str = None
    business_type: str = None
    business_id: str = None
