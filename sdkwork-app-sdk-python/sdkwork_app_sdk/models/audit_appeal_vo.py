from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditAppealVO:
    """审核申诉响应"""
    created_at: str = None
    updated_at: str = None
    appeal_id: str = None
    record_id: str = None
    reason: str = None
    description: str = None
    evidence_url: str = None
    status: str = None
    result: str = None
    comment: str = None
    submit_time: str = None
    process_time: str = None
