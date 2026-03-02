from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteFolderCreateRequest:
    """创建笔记文件夹请求"""
    name: str = None
    parent_id: str = None
