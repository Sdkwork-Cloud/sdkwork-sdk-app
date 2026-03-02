from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrivateMessageVO:
    """私信消息响应"""
    created_at: str = None
    updated_at: str = None
    message_id: str = None
    sender_id: str = None
    recipient_id: str = None
    content: str = None
    message_type: str = None
    send_time: str = None
    is_read: bool = None
    attachment_url: str = None
