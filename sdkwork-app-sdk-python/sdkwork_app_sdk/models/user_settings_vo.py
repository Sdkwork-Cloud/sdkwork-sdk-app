from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserSettingsVO:
    """用户设置响应"""
    created_at: str = None
    updated_at: str = None
    theme: str = None
    language: str = None
    notification_settings: NotificationSettingsVO = None
    privacy_settings: PrivacySettingsVO = None
