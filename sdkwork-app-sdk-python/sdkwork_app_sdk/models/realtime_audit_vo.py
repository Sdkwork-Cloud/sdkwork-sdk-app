from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RealtimeAuditVO:
    """实时内容审核响应"""
    created_at: str = None
    updated_at: str = None
    stream_id: str = None
    task_id: str = None
    status: str = None
    video_enabled: bool = None
    audio_enabled: bool = None
    push_url: str = None
    start_time: str = None
    estimated_end_time: str = None
