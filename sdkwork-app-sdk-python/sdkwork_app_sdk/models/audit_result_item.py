from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditResultItem:
    """审核结果项"""
    type: str = None
    result: str = None
    risk_level: str = None
    confidence: float = None
