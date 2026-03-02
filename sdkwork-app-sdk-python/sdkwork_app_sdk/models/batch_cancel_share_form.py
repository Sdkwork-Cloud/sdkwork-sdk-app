from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchCancelShareForm:
    """批量取消分享请求"""
    share_ids: List[str] = None
    reason: str = None
