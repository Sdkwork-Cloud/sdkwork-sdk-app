from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DetectionResult:
    """检测结果"""
    type: str = None
    hit: bool = None
    confidence: float = None
    keywords: List[str] = None
