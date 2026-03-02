from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MessageQueryForm:
    """查询消息列表请求"""
    conversation_id: str = None
    page: int = None
    size: int = None
    message_type: str = None
    start_time: str = None
    end_time: str = None
