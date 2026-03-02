from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterGenerationVO:
    """角色生成响应"""
    created_at: str = None
    updated_at: str = None
    task_id: str = None
    character_id: str = None
    name: str = None
    description: str = None
    image_url: str = None
    thumbnail_url: str = None
    style: str = None
    status: str = None
    completed_at: str = None
