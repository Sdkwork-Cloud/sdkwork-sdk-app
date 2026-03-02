from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterDetailVO:
    """角色详情响应"""
    created_at: str = None
    updated_at: str = None
    character_id: str = None
    name: str = None
    type: str = None
    description: str = None
    avatar: ImageMediaResource = None
    three_view_image: ImageMediaResource = None
    grid_shots_image: ImageMediaResource = None
    avatar_video: VideoMediaResource = None
    status: str = None
    agent_id: int = None
    personality: str = None
    background: str = None
    interaction_settings: str = None
    version: str = None
    is_public: bool = None
    usage_count: int = None
    like_count: int = None
    last_used_at: str = None
