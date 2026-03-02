from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterListVO:
    """角色列表响应"""
    created_at: str = None
    updated_at: str = None
    characters: List[CharacterItem] = None
    total: int = None
    page: int = None
    size: int = None
