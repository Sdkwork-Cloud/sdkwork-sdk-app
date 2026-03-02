from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageStatisticsVO:
    """图片统计响应"""
    created_at: str = None
    updated_at: str = None
    total_images: int = None
    completed_images: int = None
    processing_images: int = None
