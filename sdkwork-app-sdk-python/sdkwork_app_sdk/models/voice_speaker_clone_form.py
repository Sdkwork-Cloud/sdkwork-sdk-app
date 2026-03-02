from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerCloneForm:
    """声音克隆请求"""
    sample_audio_url: str
    speaker_name: str
    language: str = None
    model: str = None
