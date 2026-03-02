from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerQueryForm:
    """发音人查询请求"""
    page: int = None
    size: int = None
    keyword: str = None
    gender: str = None
    age_type: str = None
    type: str = None
    channel: str = None
    status: str = None
