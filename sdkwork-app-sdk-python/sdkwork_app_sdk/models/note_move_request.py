from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteMoveRequest:
    """移动笔记请求"""
    folder_id: str = None
