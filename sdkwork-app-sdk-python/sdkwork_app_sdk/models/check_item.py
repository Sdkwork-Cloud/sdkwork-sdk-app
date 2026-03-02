from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckItem:
    """检查项"""
    type: str = None
    target_id: str = None
