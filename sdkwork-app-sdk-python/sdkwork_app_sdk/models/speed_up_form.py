from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SpeedUpForm:
    """加速请求"""
    task_id: str
