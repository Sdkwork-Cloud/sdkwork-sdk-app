from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UploadChunkVO:
    """上传分块响应"""
    created_at: str = None
    updated_at: str = None
    upload_id: str = None
    chunk_index: int = None
    chunk_size: int = None
    status: str = None
    success: bool = None
    error_msg: str = None
    chunk_md5: str = None
    uploaded_size: int = None
    remaining_chunks: int = None
    progress: int = None
