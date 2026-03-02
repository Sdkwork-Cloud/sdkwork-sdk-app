from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioAuditVO:
    """音频审核响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    result: str = None
    risk_level: str = None
    duration: int = None
    transcript: str = None
    violation_segments: List[ViolationSegment] = None
    suggestion: str = None
