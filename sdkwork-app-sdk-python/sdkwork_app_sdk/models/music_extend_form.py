from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicExtendForm:
    """音乐延长请求"""
    music_url: str
    extend_duration: int
    model: str = None
    style: str = None
