from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Region:
    """违规区域"""
    x: int = None
    y: int = None
    width: int = None
    height: int = None
