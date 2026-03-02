from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterVO:
    """角色响应"""
    created_at: str = None
    updated_at: str = None
    character_id: str = None
    name: str = None
    type: str = None
    description: str = None
    avatar: ImageMediaResource = None
    status: str = None
    agent_id: int = None
    is_public: bool = None
    usage_count: int = None
    like_count: int = None
