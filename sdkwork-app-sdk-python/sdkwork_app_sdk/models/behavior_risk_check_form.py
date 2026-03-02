from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BehaviorRiskCheckForm:
    """行为风险检测请求"""
    user_id: str = None
    behavior_type: str = None
    frequency: int = None
    context: Dict[str, Any] = None
    time_window: int = None
