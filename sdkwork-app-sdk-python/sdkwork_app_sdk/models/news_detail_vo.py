from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NewsDetailVO:
    """新闻详情响应"""
    created_at: str = None
    updated_at: str = None
    news_id: str = None
    title: str = None
    summary: str = None
    url: str = None
    source: str = None
    category_id: int = None
    tags: TagsContent = None
    publish_time: str = None
