from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageAuditVO:
    """图片审核响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    result: str = None
    risk_level: str = None
    confidence: float = None
    details: List[ImageDetectionDetail] = None
    violation_regions: List[Region] = None
    suggestion: str = None
