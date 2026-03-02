from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AnnouncementDetailVO:
    created_at: str = None
    updated_at: str = None
    announcement_id: str = None
    title: str = None
    content: str = None
    type: str = None
    status: str = None
    author: str = None
    publish_time: str = None
    expire_time: str = None
    view_count: int = None
    is_top: bool = None
    cover_image: str = None
