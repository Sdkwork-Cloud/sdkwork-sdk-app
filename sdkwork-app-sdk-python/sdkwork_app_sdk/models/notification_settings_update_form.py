from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationSettingsUpdateForm:
    """通知设置更新表单"""
    enable_push: bool = None
    enable_email: bool = None
    enable_sms: bool = None
    enable_in_app: bool = None
    quiet_hours_start: str = None
    quiet_hours_end: str = None
    notification_sound: str = None
    vibration_enabled: bool = None
