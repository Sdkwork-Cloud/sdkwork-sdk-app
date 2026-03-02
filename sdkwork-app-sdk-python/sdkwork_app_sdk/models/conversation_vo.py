from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ConversationVO:
    """会话响应"""
    created_at: str = None
    updated_at: str = None
    conversation_id: str = None
    conversation_type: str = None
    other_user_id: str = None
    other_username: str = None
    other_nickname: str = None
    other_avatar: str = None
    last_message: str = None
    last_message_time: str = None
    unread_count: int = None
    is_top: bool = None
