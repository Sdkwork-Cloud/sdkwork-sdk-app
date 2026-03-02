from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchEventTrackForm:
    """批量事件追踪请求"""
    events: List[EventTrackForm]
    device_id: str = None
    user_id: str = None
    submit_time: str = None
