from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedAdvertVO:
    """信息流广告VO"""
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
    title: str = None
    description: str = None
    image_url: str = None
    likes: int = None
    comments: int = None
