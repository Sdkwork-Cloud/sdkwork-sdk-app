from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedbackDetailVO:
    """反馈详情信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    content: str = None
    contact: str = None
    attachment_url: str = None
    screenshot_url: str = None
    status: str = None
    submit_time: str = None
    process_time: str = None
    follow_ups: List[FeedbackFollowUpVO] = None
