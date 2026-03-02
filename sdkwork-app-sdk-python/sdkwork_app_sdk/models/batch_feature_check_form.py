from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchFeatureCheckForm:
    """批量特性检查请求"""
    feature_keys: List[str]
    user_attributes: Any = None
