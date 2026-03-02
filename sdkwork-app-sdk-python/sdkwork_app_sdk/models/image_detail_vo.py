from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageDetailVO:
    """图片详情响应"""
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
    file_size: int = None
    resource: ImageMediaResource = None
    author: AuthorInfo = None
    status: str = None
    is_public: bool = None
    is_favorite: bool = None
    view_count: int = None
    download_count: int = None
    like_count: int = None
