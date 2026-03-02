from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicUpdateForm:
    """更新音乐表单"""
    title: str = None
    description: str = None
