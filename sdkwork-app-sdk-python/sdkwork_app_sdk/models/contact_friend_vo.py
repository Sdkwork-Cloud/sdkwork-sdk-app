from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContactFriendVO:
    """Contact friend item"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    username: str = None
    nickname: str = None
    name: str = None
    avatar: str = None
    status: str = None
    is_online: bool = None
    remark: str = None
    signature: str = None
    region: str = None
    initial: str = None
