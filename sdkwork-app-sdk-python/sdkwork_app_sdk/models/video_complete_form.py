from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoCompleteForm:
    """视频完成请求"""
    advert_id: str
    video_id: str
    complete_time: str = None
    duration: str = None
    device_id: str = None
    ip_address: str = None
