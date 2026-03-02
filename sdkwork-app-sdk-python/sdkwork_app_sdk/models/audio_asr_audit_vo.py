from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioAsrAuditVO:
    """语音转文字审核响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    full_text: str = None
    segments: List[TimestampedSegment] = None
    text_audit_result: TextAuditVO = None
    overall_result: str = None
    language: str = None
