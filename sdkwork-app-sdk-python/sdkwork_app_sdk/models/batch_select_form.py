from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchSelectForm:
    """批量更新选中状态请求"""
    item_ids: List[int] = None
    selected: bool
