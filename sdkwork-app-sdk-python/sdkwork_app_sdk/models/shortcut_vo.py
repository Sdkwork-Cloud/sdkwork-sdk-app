from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShortcutVO:
    """快捷方式响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    icon: str = None
    url: str = None
    type: str = None
    sort: int = None
    group: str = None
    description: str = None
    is_default: bool = None
    enabled: bool = None
    usage_count: int = None
    last_used_at: str = None
