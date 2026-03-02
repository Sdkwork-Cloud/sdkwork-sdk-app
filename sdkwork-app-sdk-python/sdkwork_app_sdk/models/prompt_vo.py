from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptVO:
    """AI提示语响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    title: str = None
    content: str = None
    type: str = None
    biz_type: str = None
    description: str = None
    cate_id: int = None
    enabled: bool = None
    sort: int = None
    parameters: Dict[str, Any] = None
    creator: str = None
    model: str = None
    tags: TagsContent = None
    usage_count: int = None
    avg_response_time: int = None
    version: str = None
    is_public: bool = None
    is_favorite: bool = None
    favorite_count: int = None
    last_used_at: str = None
