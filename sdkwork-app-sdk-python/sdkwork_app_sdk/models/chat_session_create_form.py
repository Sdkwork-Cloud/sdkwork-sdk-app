from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChatSessionCreateForm:
    """创建聊天会话请求"""
    name: str
    description: str = None
    model_id: str = None
    system_prompt: str = None
    temperature: float = None
    max_tokens: int = None
    top_p: float = None
    type: str = None
    resource_id: str = None
