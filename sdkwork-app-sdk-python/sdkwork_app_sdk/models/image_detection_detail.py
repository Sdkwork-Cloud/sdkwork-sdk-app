from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageDetectionDetail:
    """图片检测详情"""
    type: str = None
    hit: bool = None
    confidence: float = None
    sub_type: str = None
