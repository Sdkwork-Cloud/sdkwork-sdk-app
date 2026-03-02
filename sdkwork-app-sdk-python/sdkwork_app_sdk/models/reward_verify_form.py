from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RewardVerifyForm:
    """奖励验证请求"""
    advert_id: str
    reward_id: str
    verification_token: str
    device_id: str = None
    ip_address: str = None
