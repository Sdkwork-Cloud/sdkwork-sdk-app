from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SensitiveWordsForm:
    """敏感词检测请求"""
    text: str
    word_list_type: str = None
    mode: str = None
    replacement: str = None
    categories: List[str] = None
