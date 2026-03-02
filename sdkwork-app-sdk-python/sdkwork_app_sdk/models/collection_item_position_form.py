from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionItemPositionForm:
    """内容排序表单"""
    item_ids: List[int]
