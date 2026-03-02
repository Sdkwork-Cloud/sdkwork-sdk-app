from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TopEventVO:
    """热门事件VO"""
    created_at: str = None
    updated_at: str = None
    event_name: str = None
    count: int = None
    percentage: float = None
    event_type: str = None
