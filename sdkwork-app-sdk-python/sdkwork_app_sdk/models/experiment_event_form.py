from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentEventForm:
    """实验事件请求"""
    experiment_key: str
    event_type: str = None
    event_data: Any = None
