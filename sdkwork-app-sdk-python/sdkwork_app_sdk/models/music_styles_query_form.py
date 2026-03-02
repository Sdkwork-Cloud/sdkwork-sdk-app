from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicStylesQueryForm:
    """音乐风格查询请求"""
    category: str = None
    genre: str = None
    style: str = None
    mood: str = None
    instrument: str = None
