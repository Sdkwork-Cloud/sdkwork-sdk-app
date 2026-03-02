from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ConversationQueryForm:
    """查询会话列表请求"""
    page: int = None
    size: int = None
    conversation_type: str = None
    show_unread: bool = None
    keyword: str = None
