from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextBlock:
    """文字块"""
    text: str = None
    region: Region = None
    confidence: float = None
