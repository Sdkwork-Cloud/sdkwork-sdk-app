from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationButtonVO:
    """通知按钮"""
    text: str = None
    type: str = None
    url: str = None
    action: str = None
    close_on_click: bool = None
