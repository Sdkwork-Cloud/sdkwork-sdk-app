from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicStatisticsVO:
    """音乐统计响应"""
    created_at: str = None
    updated_at: str = None
    total_music: int = None
    completed_music: int = None
    processing_music: int = None
