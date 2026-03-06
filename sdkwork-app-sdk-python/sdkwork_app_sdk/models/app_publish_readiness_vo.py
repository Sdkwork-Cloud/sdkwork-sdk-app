from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppPublishReadinessVO:
    """应用发布就绪状态"""
    ready: bool = None
    missing_fields: List[str] = None
    stores: List[AppStorePublishReadinessVO] = None
