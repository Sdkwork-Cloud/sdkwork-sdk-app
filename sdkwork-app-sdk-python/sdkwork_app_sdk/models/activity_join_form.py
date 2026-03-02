from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityJoinForm:
    """活动参与请求"""
    extra_params: Dict[str, Any] = None
    invite_code: str = None
