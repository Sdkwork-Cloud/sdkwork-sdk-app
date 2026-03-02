from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SensitiveWordListVO:
    """敏感词库响应"""
    created_at: str = None
    updated_at: str = None
    list_id: str = None
    name: str = None
    description: str = None
    type: str = None
    word_count: int = None
    categories: List[str] = None
    version: str = None
    enabled: bool = None
