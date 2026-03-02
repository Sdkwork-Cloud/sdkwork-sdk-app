from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FaqCategoryVO:
    """FAQ分类信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    icon: str = None
    sort_order: int = None
    faq_count: int = None
