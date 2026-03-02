from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrivacySettings:
    """隐私设置"""
    public_profile: bool = None
    allow_search: bool = None
    allow_friend_request: bool = None
    allow_stranger_message: bool = None
    location_share: bool = None
