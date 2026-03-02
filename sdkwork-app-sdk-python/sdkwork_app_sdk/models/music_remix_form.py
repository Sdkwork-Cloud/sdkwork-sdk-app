from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicRemixForm:
    """音乐混音请求"""
    music_url: str
    style: str
    model: str = None
