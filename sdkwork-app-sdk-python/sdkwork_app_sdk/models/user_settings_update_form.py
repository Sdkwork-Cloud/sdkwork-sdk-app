from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserSettingsUpdateForm:
    """用户设置更新请求"""
    notification_settings: NotificationSettings = None
    privacy_settings: PrivacySettings = None
    language: str = None
    theme: str = None
    auto_play: bool = None
    high_quality: bool = None
    data_saver: bool = None
    download_settings: DownloadSettings = None
