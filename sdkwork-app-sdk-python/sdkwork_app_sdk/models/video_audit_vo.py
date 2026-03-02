from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoAuditVO:
    """视频审核响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    status: str = None
    video_url: str = None
    duration: int = None
    result: str = None
    risk_level: str = None
    key_frame_results: List[KeyFrameResult] = None
    audio_result: AudioAuditVO = None
    suggestion: str = None
