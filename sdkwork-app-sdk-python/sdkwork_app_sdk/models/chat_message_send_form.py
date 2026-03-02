from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatMessageSendForm:
    """发送聊天消息请求"""
    session_id: int = None
    content: str
    type: str = None
    format: str = None
    quote_message_id: int = None
    need_thinking: bool = None
    streaming: bool = None
    model_id: str = None
    system_prompt: str = None
    temperature: float = None
    max_tokens: int = None
    top_p: float = None
