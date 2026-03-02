from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteFolderUpdateRequest:
    """更新笔记文件夹请求"""
    name: str = None
