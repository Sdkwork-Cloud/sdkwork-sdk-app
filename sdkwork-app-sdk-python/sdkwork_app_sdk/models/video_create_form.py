from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoCreateForm:
    """创建视频表单"""
    title: str = None
    description: str = None
    content_url: str
    format: str = None
    duration: int = None
    width: int = None
    height: int = None
    category_id: int = None
