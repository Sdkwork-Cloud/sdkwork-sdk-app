from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatMessageQueryForm:
    """查询聊天消息请求"""
    session_id: int = None
    message_id: int = None
    page: int = None
    size: int = None
    sort: str = None
