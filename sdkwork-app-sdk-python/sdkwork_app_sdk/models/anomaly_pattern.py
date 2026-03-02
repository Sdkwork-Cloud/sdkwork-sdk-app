from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AnomalyPattern:
    """异常模式"""
    type: str = None
    description: str = None
    severity: str = None
    detected_at: str = None
