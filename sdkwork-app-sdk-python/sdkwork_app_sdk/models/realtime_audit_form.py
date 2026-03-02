from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RealtimeAuditForm:
    """实时内容审核请求"""
    stream_id: str
    stream_url: str = None
    stream_type: str = None
    room_id: str = None
    publisher_id: str = None
    check_types: List[str] = None
    callback_url: str = None
    check_audio: bool = None
    check_video: bool = None
