from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationSettingsVO:
    """通知设置"""
    system: bool = None
    message: bool = None
    activity: bool = None
    promotion: bool = None
    sound: bool = None
    vibration: bool = None
