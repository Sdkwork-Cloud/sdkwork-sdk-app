from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextAuditForm:
    """文本审核请求"""
    content: str
    content_id: str = None
    content_type: str = None
    scene: str = None
    user_id: str = None
    check_types: List[str] = None
    async: bool = None
