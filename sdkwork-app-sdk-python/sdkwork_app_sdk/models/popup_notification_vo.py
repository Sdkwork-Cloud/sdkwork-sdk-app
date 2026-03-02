from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PopupNotificationVO:
    """弹窗通知响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    content: str = None
    type: str = None
    icon: str = None
    image: str = None
    url: str = None
    buttons: List[NotificationButtonVO] = None
    need_confirm: bool = None
    closable: bool = None
    duration: int = None
    priority: int = None
