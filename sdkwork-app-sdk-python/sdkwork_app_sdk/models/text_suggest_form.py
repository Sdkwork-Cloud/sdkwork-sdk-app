from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextSuggestForm:
    """文本替换建议请求"""
    text: str
    suggest_type: str = None
    scene: str = None
