from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShortcutItemForm:
    """快捷方式项"""
    id: str = None
    name: str = None
    icon: str = None
    url: str = None
    sort: int = None
    type: str = None
