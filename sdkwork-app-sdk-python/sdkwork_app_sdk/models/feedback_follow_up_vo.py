from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedbackFollowUpVO:
    """反馈跟进信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    feedback_id: str = None
    content: str = None
    attachment_url: str = None
    follow_up_time: str = None
    follower: str = None
