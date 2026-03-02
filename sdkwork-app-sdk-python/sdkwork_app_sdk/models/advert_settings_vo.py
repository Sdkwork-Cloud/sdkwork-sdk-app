from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertSettingsVO:
    """广告设置VO"""
    created_at: str = None
    updated_at: str = None
    enabled: bool = None
    personalized: bool = None
    max_daily_ads: int = None
    ad_block_level: str = None
    reward_video_enabled: bool = None
    interstitial_enabled: bool = None
    banner_enabled: bool = None
    last_updated: str = None
