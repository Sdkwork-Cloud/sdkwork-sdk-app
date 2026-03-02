from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ReportDetailVO:
    """举报详情信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    target_id: str = None
    content: str = None
    attachment_url: str = None
    screenshot_url: str = None
    status: str = None
    submit_time: str = None
    process_time: str = None
    process_result: str = None
