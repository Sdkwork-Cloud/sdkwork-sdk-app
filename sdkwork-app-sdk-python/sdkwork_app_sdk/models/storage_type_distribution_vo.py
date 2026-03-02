from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StorageTypeDistributionVO:
    """存储类型分布"""
    text: float = None
    image: float = None
    audio: float = None
    video: float = None
    other: float = None
