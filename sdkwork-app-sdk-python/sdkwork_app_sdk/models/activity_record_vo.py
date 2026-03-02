from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityRecordVO:
    """活动参与记录"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    activity_id: str = None
    activity_title: str = None
    activity_type: str = None
    participate_time: str = None
    status: str = None
    result: str = None
    rewards: Dict[str, Any] = None
