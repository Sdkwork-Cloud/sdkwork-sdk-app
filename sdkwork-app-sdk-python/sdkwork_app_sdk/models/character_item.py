from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterItem:
    """角色项"""
    description: str
    style: str = None
    pose: str = None
