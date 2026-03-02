from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvertConfigVO:
    """广告配置VO"""
    created_at: str = None
    updated_at: str = None
    config_id: str = None
    enabled: bool = None
    max_ads_per_hour: int = None
    min_interval: int = None
    ad_network: str = None
    api_key: str = None
    status: str = None
