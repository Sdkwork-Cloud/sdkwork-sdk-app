from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerCreateForm:
    """发音人创建请求"""
    name: str
    local_name: str = None
    code: str
    face_image_url: str = None
    channel: str = None
    product: str = None
    gender: str = None
    age_type: str = None
    type: str = None
    models: List[str] = None
    channel_speaker_id: str = None
    version: str = None
    description: str = None
    tags: List[str] = None
