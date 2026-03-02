from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategorySortForm:
    """分类排序请求"""
    category_id: str = None
