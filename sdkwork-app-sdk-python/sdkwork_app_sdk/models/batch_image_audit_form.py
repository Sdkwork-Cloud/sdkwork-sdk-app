from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchImageAuditForm:
    """批量图片审核请求"""
    images: List[ImageItem]
    check_types: List[str] = None
    scene: str = None
