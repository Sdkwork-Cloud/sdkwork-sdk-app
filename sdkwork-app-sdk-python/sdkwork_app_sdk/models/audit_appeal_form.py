from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditAppealForm:
    """审核申诉请求"""
    reason: str
    description: str = None
    evidence_url: str = None
    contact_email: str = None
    expected_action: str = None
