from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterCreateForm:
    """创建角色表单"""
    name: str
    type: str = None
    description: str = None
    agent_id: int = None
