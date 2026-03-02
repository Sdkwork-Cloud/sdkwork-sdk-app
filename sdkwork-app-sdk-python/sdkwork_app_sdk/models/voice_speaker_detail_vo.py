from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerDetailVO:
    """发音人详情响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    local_name: str = None
    code: str = None
    face_image_url: str = None
    face_video_url: str = None
    resource_urls: List[str] = None
    channel: str = None
    channel_name: str = None
    product: str = None
    gender: str = None
    gender_name: str = None
    age_type: str = None
    age_type_name: str = None
    type: str = None
    type_name: str = None
    models: List[str] = None
    channel_speaker_id: str = None
    version: str = None
    is_default: bool = None
    status: str = None
    status_name: str = None
    description: str = None
    tags: List[str] = None
    voice_sources: List[VoiceSourceVO] = None
    sample_audios: List[str] = None
    attributes: Dict[str, Any] = None
