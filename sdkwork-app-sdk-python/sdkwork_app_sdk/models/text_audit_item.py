from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TextAuditItem:
    """文本审核项"""
    id: str = None
    audit_result: TextAuditVO = None
