from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TutorialDetailVO:
    """教程详情信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    description: str = None
    content: str = None
    category_id: str = None
    category_name: str = None
    view_count: int = None
    like_count: int = None
    cover_image: str = None
