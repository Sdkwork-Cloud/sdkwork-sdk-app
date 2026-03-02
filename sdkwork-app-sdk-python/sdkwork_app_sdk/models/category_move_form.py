from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryMoveForm:
    """移动分类请求"""
    target_parent_id: int = None
