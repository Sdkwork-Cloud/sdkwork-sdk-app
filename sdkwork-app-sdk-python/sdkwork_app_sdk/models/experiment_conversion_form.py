from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentConversionForm:
    """实验转化事件请求"""
    experiment_key: str
    conversion_goal: str = None
    conversion_value: float = None
