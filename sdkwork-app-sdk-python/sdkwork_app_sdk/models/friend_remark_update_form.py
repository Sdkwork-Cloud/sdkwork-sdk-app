from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FriendRemarkUpdateForm:
    """Update friend remark request"""
    remark: str = None
