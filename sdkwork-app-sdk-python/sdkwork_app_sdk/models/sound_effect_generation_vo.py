from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SoundEffectGenerationVO:
    """音效生成响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    sound_effect_id: str = None
    name: str = None
    description: str = None
    audio_url: str = None
    waveform_url: str = None
    category: str = None
    duration: int = None
    status: str = None
    completed_at: str = None
