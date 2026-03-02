from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FaqDetailVO:
    """FAQ详情信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    question: str = None
    answer: str = None
    category_id: str = None
    category_name: str = None
    view_count: int = None
    helpful_count: int = None
