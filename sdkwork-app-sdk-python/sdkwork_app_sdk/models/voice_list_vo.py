from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceListVO:
    """语音列表响应"""
    created_at: str = None
    updated_at: str = None
    voices: List[VoiceItem] = None
