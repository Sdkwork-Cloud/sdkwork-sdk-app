from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrivacySettingsVO:
    """隐私设置"""
    public_profile: bool = None
    allow_search: bool = None
    allow_friend_request: bool = None
