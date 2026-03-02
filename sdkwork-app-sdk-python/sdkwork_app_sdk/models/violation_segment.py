from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ViolationSegment:
    """违规片段"""
    start_time: int = None
    end_time: int = None
    violation_type: str = None
    text: str = None
    confidence: float = None
