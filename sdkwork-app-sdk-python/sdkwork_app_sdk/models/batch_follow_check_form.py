from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchFollowCheckForm:
    """批量检查关注状态请求"""
    user_ids: List[str] = None
    check_type: str = None
