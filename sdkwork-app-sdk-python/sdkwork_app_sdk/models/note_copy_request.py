from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteCopyRequest:
    """复制笔记请求"""
    folder_id: str = None
    title: str = None
