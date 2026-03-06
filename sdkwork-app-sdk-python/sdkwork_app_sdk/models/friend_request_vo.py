from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FriendRequestVO:
    """Friend request item"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    from_id: str = None
    from_name: str = None
    from_avatar: str = None
    to_id: str = None
    status: str = None
    message: str = None
