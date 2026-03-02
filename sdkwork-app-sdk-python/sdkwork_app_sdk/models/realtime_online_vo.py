from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RealtimeOnlineVO:
    """实时在线VO"""
    created_at: str = None
    updated_at: str = None
    current_online: int = None
    peak_online: int = None
    average_online: int = None
    new_users: int = None
    active_users: int = None
    timestamp: str = None
