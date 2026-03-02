from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedbackSubmitForm:
    """反馈提交表单"""
    type: str
    content: str
    contact: str = None
    attachment_url: str = None
    screenshot_url: str = None
