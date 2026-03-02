from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TimestampedSegment:
    """时间戳段"""
    start_time: int = None
    end_time: int = None
    text: str = None
    speaker_id: int = None
    confidence: float = None
