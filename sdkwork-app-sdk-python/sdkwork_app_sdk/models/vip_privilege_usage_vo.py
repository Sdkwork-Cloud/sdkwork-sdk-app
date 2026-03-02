from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPrivilegeUsageVO:
    """VIP特权使用情况响应"""
    created_at: str = None
    updated_at: str = None
    speed_up_used: int = None
    speed_up_limit: int = None
    priority_queue_used: int = None
    priority_queue_limit: int = None
    exclusive_model_used: int = None
    exclusive_model_limit: int = None
