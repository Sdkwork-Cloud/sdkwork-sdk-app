from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteBatchUpdateRequest:
    """笔记批量更新请求"""
    requests: List[NoteBatchOperationRequest]
    strict: bool = None
