from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerItem:
    """说话人项"""
    speaker_id: str = None
    speaker_name: str = None
    description: str = None
    preview_audio_url: str = None
    gender: str = None
    age_range: str = None
    language: str = None
    style: str = None
    favorite: bool = None
    created_at: str = None
