from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WordHit:
    """敏感词命中"""
    word: str = None
    start_index: int = None
    end_index: int = None
    category: str = None
    severity: str = None
