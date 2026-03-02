from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetStatisticsVO:
    total_assets: int = None
    image_count: int = None
    video_count: int = None
    audio_count: int = None
