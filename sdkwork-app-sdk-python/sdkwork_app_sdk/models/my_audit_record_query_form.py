from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MyAuditRecordQueryForm:
    """我的审核记录查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    content_type: str = None
    result: str = None
    start_date: str = None
    end_date: str = None
    size: int = None
    page: int = None
