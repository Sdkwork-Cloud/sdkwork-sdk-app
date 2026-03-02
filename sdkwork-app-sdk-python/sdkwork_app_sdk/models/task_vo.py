from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TaskVO:
    """任务信息"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    task_name: str = None
    task_type: str = None
    status: str = None
    progress: int = None
    total: int = None
    reward_type: str = None
    reward_amount: int = None
    expire_at: str = None
