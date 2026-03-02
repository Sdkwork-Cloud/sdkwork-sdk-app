from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class KeyFrameResult:
    """关键帧结果"""
    timestamp: int = None
    frame_url: str = None
    detection_result: ImageAuditVO = None
