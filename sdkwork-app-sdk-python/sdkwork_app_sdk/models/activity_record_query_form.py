from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityRecordQueryForm:
    """活动参与记录查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    activity_id: str = None
    record_type: str = None
    size: int = None
    page: int = None
