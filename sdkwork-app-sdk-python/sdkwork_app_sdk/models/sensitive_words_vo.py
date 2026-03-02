from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SensitiveWordsVO:
    """敏感词检测响应"""
    created_at: str = None
    updated_at: str = None
    has_sensitive_words: bool = None
    count: int = None
    words: List[WordHit] = None
    processed_text: str = None
    risk_level: str = None
