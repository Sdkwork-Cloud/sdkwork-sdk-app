from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeatureFlagVO:
    """特性开关响应"""
    created_at: str = None
    updated_at: str = None
    feature_key: str = None
    feature_name: str = None
    enabled: bool = None
    value: Any = None
    description: str = None
