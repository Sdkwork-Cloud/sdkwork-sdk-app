from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSourceVO:
    """音源信息"""
    id: str = None
    name: str = None
    type: str = None
    language: str = None
    sample_rate: int = None
