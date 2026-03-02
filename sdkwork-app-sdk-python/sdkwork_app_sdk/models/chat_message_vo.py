from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatMessageVO:
    """聊天消息响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    session_id: int = None
    content: str = None
    type: str = None
    format: str = None
    status: str = None
    sender_type: str = None
    sender_id: str = None
    receiver_id: str = None
    quote_message_id: int = None
    thinking: str = None
    model_id: str = None
    response_time: int = None
    token_count: int = None
    attachments: List[AttachmentVO] = None
    create_time: str = None
    update_time: str = None
