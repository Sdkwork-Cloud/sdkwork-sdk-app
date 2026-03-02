from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatSessionUpdateForm:
    """更新聊天会话请求"""
    session_id: int
    name: str
    description: str = None
    model_id: str = None
    system_prompt: str = None
    temperature: float = None
    max_tokens: int = None
    top_p: float = None
    status: str = None
