from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceItem:
    """语音项"""
    voice_id: str = None
    name: str = None
    description: str = None
    language: str = None
    gender: str = None
    style: str = None
    preview_audio_url: str = None
