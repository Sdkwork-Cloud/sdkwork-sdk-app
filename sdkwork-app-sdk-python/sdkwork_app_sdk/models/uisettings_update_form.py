from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UISettingsUpdateForm:
    """更新界面设置请求"""
    theme: str = None
    language: str = None
    font_size: str = None
    zoom_level: int = None
    notifications_enabled: bool = None
    shortcuts_enabled: bool = None
    sidebar_state: str = None
    auto_save_enabled: bool = None
