from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchImageAuditVO:
    """批量图片审核响应"""
    created_at: str = None
    updated_at: str = None
    batch_id: str = None
    results: List[ImageAuditItem] = None
    overall_status: str = None
    total_count: int = None
    pass_count: int = None
    reject_count: int = None
