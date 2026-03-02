from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TaskRewardVO:
    """任务奖励"""
    created_at: str = None
    updated_at: str = None
    reward_id: str = None
    task_id: str = None
    reward_type: str = None
    reward_amount: int = None
    status: str = None
    message: str = None
    claimed_at: str = None
