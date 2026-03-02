from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuditPolicyVO:
    """审核策略响应"""
    created_at: str = None
    updated_at: str = None
    policy_id: str = None
    name: str = None
    description: str = None
    scenes: List[str] = None
    detection_types: List[DetectionTypeConfig] = None
    thresholds: Dict[str, float] = None
    enabled: bool = None
    priority: int = None
