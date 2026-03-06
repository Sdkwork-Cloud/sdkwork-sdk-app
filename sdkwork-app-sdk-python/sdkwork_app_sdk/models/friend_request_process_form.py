from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FriendRequestProcessForm:
    """Process friend request"""
    action: str
