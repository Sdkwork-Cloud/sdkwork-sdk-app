from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextItem:
    """文本项"""
    id: str = None
    content: str = None
    content_type: str = None
