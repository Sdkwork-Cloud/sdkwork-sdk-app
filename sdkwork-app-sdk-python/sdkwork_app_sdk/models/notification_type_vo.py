from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationTypeVO:
    """通知类型响应"""
    created_at: str = None
    updated_at: str = None
    type: str = None
    name: str = None
    enabled: bool = None
    push_method: str = None
    need_reminder: bool = None
    description: str = None
