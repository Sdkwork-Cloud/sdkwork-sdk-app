from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SharePlatformVO:
    """分享平台响应"""
    created_at: str = None
    updated_at: str = None
    platform_id: str = None
    platform_name: str = None
    platform_icon: str = None
    supported: bool = None
