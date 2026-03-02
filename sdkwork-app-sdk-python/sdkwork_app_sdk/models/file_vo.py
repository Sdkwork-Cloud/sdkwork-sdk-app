from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileVO:
    """文件信息响应"""
    created_at: str = None
    updated_at: str = None
    file_id: str = None
    file_name: str = None
    file_size: int = None
    file_type: str = None
    extension: str = None
    object_key: str = None
    path: str = None
    disk_id: str = None
    status: str = None
    upload_status: str = None
    content_type: str = None
    file_category: str = None
    asset_type: str = None
    access_url: str = None
    upload_time: str = None
