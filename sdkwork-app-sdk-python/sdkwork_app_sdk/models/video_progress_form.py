from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoProgressForm:
    """视频进度请求"""
    advert_id: str
    video_id: str
    progress: int
    timestamp: str = None
    device_id: str = None
    ip_address: str = None
