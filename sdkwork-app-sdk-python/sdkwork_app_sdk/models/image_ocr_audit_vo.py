from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageOcrAuditVO:
    """图片OCR审核响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    ocr_text: str = None
    text_blocks: List[TextBlock] = None
    text_audit_result: TextAuditVO = None
    overall_result: str = None
