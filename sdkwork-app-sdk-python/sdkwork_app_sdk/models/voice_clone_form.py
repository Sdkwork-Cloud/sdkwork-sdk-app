from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceCloneForm:
    """语音克隆请求"""
    sample_audio_url: str
    text: str
    model: str = None
    format: str = None
