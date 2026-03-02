from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SessionStatsVO:
    """会话统计信息"""
    total_messages: int = None
    user_messages: int = None
    ai_messages: int = None
    total_tokens: int = None
    avg_response_time: int = None
    total_duration: int = None
