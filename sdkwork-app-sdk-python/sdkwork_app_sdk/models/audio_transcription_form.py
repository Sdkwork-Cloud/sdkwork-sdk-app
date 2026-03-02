from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioTranscriptionForm:
    """语音转文本请求"""
    audio_url: str
    model: str = None
    language: str = None
    format: str = None
