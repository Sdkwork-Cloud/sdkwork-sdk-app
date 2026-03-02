from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoVO:
    """视频响应"""
    created_at: str = None
    updated_at: str = None
    video_id: str = None
    title: str = None
    description: str = None
    content_url: str = None
    format: str = None
    duration: int = None
    thumbnail_url: str = None
    width: int = None
    height: int = None
    aspect_ratio: str = None
    category_id: int = None
    status: str = None
    is_public: bool = None
    is_favorite: bool = None
    play_count: int = None
    like_count: int = None
