from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BatchTextAuditForm:
    """批量文本审核请求"""
    items: List[TextItem]
    check_types: List[str] = None
    scene: str = None
