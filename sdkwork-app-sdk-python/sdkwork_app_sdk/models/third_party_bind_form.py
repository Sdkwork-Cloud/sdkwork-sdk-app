from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThirdPartyBindForm:
    """第三方绑定请求"""
    platform: str = None
    code: str = None
    third_party_user_id: str = None
    third_party_user_name: str = None
    third_party_avatar: str = None
    access_token: str = None
    refresh_token: str = None
    expire_time: str = None
