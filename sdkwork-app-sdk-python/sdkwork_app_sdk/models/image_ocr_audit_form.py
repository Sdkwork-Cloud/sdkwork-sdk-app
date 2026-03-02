from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageOcrAuditForm:
    """图片OCR审核请求"""
    image_url: str
    content_id: str = None
    check_types: List[str] = None
    language: str = None
    return_full_text: bool = None
