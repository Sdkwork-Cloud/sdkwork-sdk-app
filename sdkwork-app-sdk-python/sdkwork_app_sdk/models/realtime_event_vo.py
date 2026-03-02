from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RealtimeEventVO:
    """实时事件VO"""
    created_at: str = None
    updated_at: str = None
    event_id: str = None
    event_name: str = None
    event_type: str = None
    user_id: str = None
    device_id: str = None
    timestamp: str = None
    page_url: str = None
    referrer: str = None
