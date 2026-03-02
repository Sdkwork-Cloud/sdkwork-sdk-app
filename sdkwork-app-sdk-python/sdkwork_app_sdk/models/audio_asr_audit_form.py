from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioAsrAuditForm:
    """语音转文字审核请求"""
    audio_url: str
    content_id: str = None
    language: str = None
    check_types: List[str] = None
    with_timestamp: bool = None
