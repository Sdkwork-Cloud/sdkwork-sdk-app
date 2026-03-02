from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditRecordVO:
    """审核记录响应"""
    created_at: str = None
    updated_at: str = None
    record_id: str = None
    content_id: str = None
    content_type: str = None
    content_preview: str = None
    result: str = None
    risk_level: str = None
    check_types: List[str] = None
    violation_types: List[str] = None
    audit_time: str = None
    process_time: int = None
