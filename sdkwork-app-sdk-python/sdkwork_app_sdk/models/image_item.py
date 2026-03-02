from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageItem:
    """图片项"""
    id: str = None
    url: str = None
    content_type: str = None
