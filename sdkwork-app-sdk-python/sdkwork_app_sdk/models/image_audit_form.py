from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageAuditForm:
    """图片审核请求"""
    image_url: str
    image_base64: str = None
    content_id: str = None
    content_type: str = None
    check_types: List[str] = None
    scene: str = None
    async: bool = None
