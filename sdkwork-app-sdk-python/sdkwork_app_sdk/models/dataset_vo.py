from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DatasetVO:
    """数据集"""
    label: str = None
    data: List[Any] = None
    background_color: List[str] = None
    border_color: List[str] = None
    border_width: int = None
