from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ReportQueryForm:
    """举报查询表单"""
    type: str = None
    status: str = None
    page: int = None
    size: int = None
