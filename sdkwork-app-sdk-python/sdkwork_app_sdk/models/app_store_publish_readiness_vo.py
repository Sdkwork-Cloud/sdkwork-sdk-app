from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppStorePublishReadinessVO:
    """单个商店发布就绪状态"""
    platform: str = None
    ready: bool = None
    missing_fields: List[str] = None
