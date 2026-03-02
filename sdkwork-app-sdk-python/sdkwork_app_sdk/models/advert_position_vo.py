from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertPositionVO:
    """广告位VO"""
    created_at: str = None
    updated_at: str = None
    position_id: str = None
    position_name: str = None
    position_type: str = None
    description: str = None
    priority: int = None
    enabled: bool = None
    advert_count: int = None
