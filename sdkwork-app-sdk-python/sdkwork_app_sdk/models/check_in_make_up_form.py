from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckInMakeUpForm:
    """补签请求"""
    date: str
