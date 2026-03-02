from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedbackFollowUpForm:
    """反馈跟进表单"""
    feedback_id: str
    content: str
    attachment_url: str = None
