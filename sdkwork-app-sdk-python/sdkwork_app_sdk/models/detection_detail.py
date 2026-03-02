from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DetectionDetail:
    """检测结果详情"""
    type: str = None
    hit: bool = None
    confidence: float = None
    keywords: List[str] = None
