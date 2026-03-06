from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteBatchOperationRequest:
    """笔记批量操作请求"""
    type: str
    index: int = None
    start_index: int = None
    end_index: int = None
    text: str = None
    search_text: str = None
    replace_text: str = None
