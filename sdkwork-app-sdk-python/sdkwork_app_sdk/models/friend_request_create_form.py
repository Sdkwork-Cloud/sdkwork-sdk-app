from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FriendRequestCreateForm:
    """Create friend request"""
    to_user_id: str
    message: str = None
