from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentAuditVO:
    """综合内容审核响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    content_id: str = None
    overall_result: str = None
    risk_level: str = None
    results: Dict[str, AuditResultItem] = None
    text_result: TextAuditVO = None
    image_results: List[ImageAuditVO] = None
    video_result: VideoAuditVO = None
    audio_result: AudioAuditVO = None
    suggestion: str = None
