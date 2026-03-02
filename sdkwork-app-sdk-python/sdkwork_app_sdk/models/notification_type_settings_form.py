from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationTypeSettingsForm:
    """通知类型设置表单"""
    type: str
    enabled: bool = None
    push_method: str = None
    need_reminder: bool = None
