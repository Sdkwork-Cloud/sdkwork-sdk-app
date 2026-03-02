from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ReplacementPosition:
    """替换位置"""
    start: int = None
    end: int = None
    original: str = None
    replacement: str = None
