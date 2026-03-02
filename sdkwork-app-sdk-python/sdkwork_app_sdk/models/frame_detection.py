from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FrameDetection:
    """帧检测"""
    timestamp: int = None
    result: str = None
    risk_level: str = None
