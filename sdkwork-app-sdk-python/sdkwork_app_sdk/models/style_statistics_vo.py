from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StyleStatisticsVO:
    """风格统计响应"""
    created_at: str = None
    updated_at: str = None
    total_styles: int = None
    active_styles: int = None
    image_styles: int = None
    video_styles: int = None
    music_styles: int = None
