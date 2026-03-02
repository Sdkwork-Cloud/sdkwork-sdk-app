from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoAuditForm:
    """视频审核请求"""
    video_url: str
    content_id: str = None
    title: str = None
    description: str = None
    content_type: str = None
    check_types: List[str] = None
    callback_url: str = None
    duration: int = None
