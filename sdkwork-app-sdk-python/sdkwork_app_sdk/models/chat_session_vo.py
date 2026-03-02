from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatSessionVO:
    """聊天会话响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    type: str = None
    status: str = None
    model_id: str = None
    message_count: int = None
    unread_count: int = None
    last_message_time: str = None
    last_message_content: str = None
    create_time: str = None
    update_time: str = None
