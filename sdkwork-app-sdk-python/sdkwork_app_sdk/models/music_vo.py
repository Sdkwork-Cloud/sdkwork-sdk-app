from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicVO:
    """音乐响应"""
    created_at: str = None
    updated_at: str = None
    music_id: str = None
    title: str = None
    description: str = None
    content_url: str = None
    format: str = None
    duration: int = None
    artist: str = None
    genre: str = None
    thumbnail_url: str = None
    status: str = None
    is_public: bool = None
    is_favorite: bool = None
    play_count: int = None
    like_count: int = None
