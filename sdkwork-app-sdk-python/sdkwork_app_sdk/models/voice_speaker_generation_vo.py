from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerGenerationVO:
    """说话人生成响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    speaker_id: str = None
    speaker_name: str = None
    description: str = None
    preview_audio_url: str = None
    gender: str = None
    age_range: str = None
    language: str = None
    style: str = None
    status: str = None
    favorite: bool = None
    completed_at: str = None
