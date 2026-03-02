from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageAuditItem:
    """图片审核项"""
    id: str = None
    audit_result: ImageAuditVO = None
