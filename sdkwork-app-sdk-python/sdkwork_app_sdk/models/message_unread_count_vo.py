from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MessageUnreadCountVO:
    """未读消息数响应"""
    created_at: str = None
    updated_at: str = None
    total_unread: int = None
    private_unread: int = None
    system_unread: int = None
