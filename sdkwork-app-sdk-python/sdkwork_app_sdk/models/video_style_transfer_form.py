from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoStyleTransferForm:
    """视频风格转换请求"""
    video_url: str
    style: str
    model: str = None
