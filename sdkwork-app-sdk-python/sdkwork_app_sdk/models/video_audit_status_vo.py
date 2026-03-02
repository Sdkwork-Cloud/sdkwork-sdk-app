from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoAuditStatusVO:
    """视频审核状态响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    status: str = None
    progress: int = None
    processed_duration: int = None
    total_duration: int = None
    detections: List[FrameDetection] = None
    estimated_complete_time: str = None
