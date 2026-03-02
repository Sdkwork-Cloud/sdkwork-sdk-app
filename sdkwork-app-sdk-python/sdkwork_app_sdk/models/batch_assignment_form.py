from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchAssignmentForm:
    """批量实验分组请求"""
    experiment_keys: List[str]
    user_attributes: Dict[str, Any] = None
