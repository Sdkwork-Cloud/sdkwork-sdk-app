from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageVO:
    """图片响应"""
    created_at: str = None
    updated_at: str = None
    image_id: str = None
    title: str = None
    description: str = None
    url: str = None
    format: str = None
    width: int = None
    height: int = None
    aspect_ratio: str = None
    status: str = None
    is_public: bool = None
    is_favorite: bool = None
    view_count: int = None
    like_count: int = None
