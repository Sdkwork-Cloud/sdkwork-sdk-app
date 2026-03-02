from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RolloutCheckVO:
    """发布检查响应"""
    created_at: str = None
    updated_at: str = None
    rollout_key: str = None
    can_rollout: bool = None
    reason: str = None
    status: str = None
    checked_at: str = None
