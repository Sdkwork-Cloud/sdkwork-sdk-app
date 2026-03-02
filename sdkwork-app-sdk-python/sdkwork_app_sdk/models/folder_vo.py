from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FolderVO:
    """文件夹响应"""
    created_at: str = None
    updated_at: str = None
    folder_id: str = None
    folder_name: str = None
    parent_id: str = None
    child_count: int = None
    file_count: int = None
