from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioTranslationForm:
    """语音翻译请求"""
    audio_url: str
    target_language: str
    model: str = None
    source_language: str = None
    format: str = None
