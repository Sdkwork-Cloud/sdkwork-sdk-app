from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatSessionDetailVO:
    """聊天会话详情响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    type: str = None
    status: str = None
    user_id: str = None
    model_id: str = None
    system_prompt: str = None
    temperature: float = None
    max_tokens: int = None
    top_p: float = None
    message_count: int = None
    unread_count: int = None
    last_message_time: str = None
    last_message_content: str = None
    resource_id: str = None
    resource_type: str = None
    create_time: str = None
    update_time: str = None
    extra: Dict[str, Any] = None
    stats: SessionStatsVO = None
