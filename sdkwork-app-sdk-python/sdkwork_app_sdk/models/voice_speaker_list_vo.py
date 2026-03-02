from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerListVO:
    """说话人列表响应"""
    created_at: str = None
    updated_at: str = None
    speakers: List[VoiceSpeakerItem] = None
    total: int = None
    page: int = None
    size: int = None
