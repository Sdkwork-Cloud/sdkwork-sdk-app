from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SendMessageForm:
    """发送消息请求"""
    recipient_id: str = None
    content: str = None
    message_type: str = None
    conversation_id: str = None
    attachment_url: str = None
