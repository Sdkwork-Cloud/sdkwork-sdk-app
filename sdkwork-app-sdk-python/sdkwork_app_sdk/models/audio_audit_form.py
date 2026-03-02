from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioAuditForm:
    """音频审核请求"""
    audio_url: str
    format: str = None
    content_id: str = None
    duration: int = None
    check_types: List[str] = None
    sample_rate: int = None
