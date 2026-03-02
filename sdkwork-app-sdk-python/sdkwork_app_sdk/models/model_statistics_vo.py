from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelStatisticsVO:
    """模型统计响应"""
    created_at: str = None
    updated_at: str = None
    total_models: int = None
    active_models: int = None
    chat_models: int = None
    image_models: int = None
    audio_models: int = None
