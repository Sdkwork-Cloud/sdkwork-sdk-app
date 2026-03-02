from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ReportSubmitForm:
    """举报提交表单"""
    type: str
    target_id: str
    content: str
    attachment_url: str = None
    screenshot_url: str = None
