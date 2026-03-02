from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicCreateForm:
    """创建音乐表单"""
    title: str = None
    description: str = None
    content_url: str
    format: str = None
    duration: int = None
    artist: str = None
    genre: str = None
