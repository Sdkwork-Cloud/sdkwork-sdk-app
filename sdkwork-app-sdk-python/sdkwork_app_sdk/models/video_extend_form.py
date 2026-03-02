from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoExtendForm:
    """视频延长请求"""
    video_url: str
    extend_duration: int
    model: str = None
    style: str = None
