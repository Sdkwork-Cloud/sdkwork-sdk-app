from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditAppealStatusVO:
    """申诉状态响应"""
    created_at: str = None
    updated_at: str = None
    appeal_id: str = None
    record_id: str = None
    current_status: str = None
    status_description: str = None
    progress: int = None
    estimated_complete_time: str = None
    result: str = None
    can_add_evidence: bool = None
    can_cancel: bool = None
