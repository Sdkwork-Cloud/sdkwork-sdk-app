from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SupportMessageVO:
    """支持消息信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    session_id: str = None
    content: str = None
    attachment_url: str = None
    sender_type: str = None
    send_time: str = None
    read: bool = None
