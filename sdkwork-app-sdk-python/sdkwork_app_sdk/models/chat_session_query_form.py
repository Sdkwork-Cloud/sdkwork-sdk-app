from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatSessionQueryForm:
    """查询聊天会话请求"""
    session_id: int = None
    name: str = None
    type: str = None
    page: int = None
    size: int = None
    sort_by: str = None
    sort_direction: str = None
    include_message_count: bool = None
