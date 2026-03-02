from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentAuditForm:
    """综合内容审核请求"""
    content_id: str
    text_content: str = None
    image_urls: List[str] = None
    video_url: str = None
    audio_url: str = None
    content_type: str = None
    scene: str = None
    check_types: List[str] = None
    metadata: Dict[str, Any] = None
    user_id: str = None
