from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ReportVO:
    """举报信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    target_id: str = None
    status: str = None
    submit_time: str = None
    process_time: str = None
