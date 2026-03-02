from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SupportMessageRequest:
    """支持消息请求表单"""
    session_id: str = None
    content: str
    attachment_url: str = None
