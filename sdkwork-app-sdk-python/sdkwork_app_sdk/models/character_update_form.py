from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterUpdateForm:
    """更新角色表单"""
    name: str = None
    description: str = None
    personality: str = None
    background: str = None
