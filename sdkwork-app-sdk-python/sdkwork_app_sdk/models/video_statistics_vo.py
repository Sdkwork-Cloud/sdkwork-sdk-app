from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoStatisticsVO:
    """视频统计响应"""
    created_at: str = None
    updated_at: str = None
    total_videos: int = None
    completed_videos: int = None
    processing_videos: int = None
