from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BrowseHistoryVO:
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    target_id: str = None
    target_name: str = None
    target_description: str = None
    target_icon: str = None
    browse_time: str = None
    duration: int = None
    source: str = None
