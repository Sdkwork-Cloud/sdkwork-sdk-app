from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ThemeSwitchForm:
    """切换主题请求"""
    theme: str
