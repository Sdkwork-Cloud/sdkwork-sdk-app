from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UISettingsVO:
    """界面设置响应"""
    created_at: str = None
    updated_at: str = None
    theme: str = None
    language: str = None
    font_size: str = None
    zoom_level: int = None
    notifications_enabled: bool = None
    shortcuts_enabled: bool = None
    sidebar_state: str = None
    auto_save_enabled: bool = None
