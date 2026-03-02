from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SplashAdvertVO:
    """开屏广告VO"""
    created_at: str = None
    updated_at: str = None
    advert_id: str = None
    advert_name: str = None
    advert_type: str = None
    position_id: str = None
    creative_url: str = None
    landing_url: str = None
    priority: int = None
    enabled: bool = None
    start_time: str = None
    end_time: str = None
    click_count: int = None
    impression_count: int = None
    display_duration: int = None
    skip_enabled: bool = None
    skip_delay: int = None
    background_color: str = None
    logo_url: str = None
