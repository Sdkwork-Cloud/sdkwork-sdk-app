from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditRecordDetailVO:
    """审核记录详情响应"""
    created_at: str = None
    updated_at: str = None
    record_id: str = None
    content_id: str = None
    content_type: str = None
    original_content: str = None
    processed_content: str = None
    user_id: str = None
    result: str = None
    risk_level: str = None
    confidence: float = None
    detection_results: List[DetectionResult] = None
    check_types: List[str] = None
    scene: str = None
    device_info: Dict[str, Any] = None
    ip_address: str = None
    location: str = None
    audit_time: str = None
    process_time: int = None
    has_appeal: bool = None
