from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GlobalSearchVO:
    """全局搜索响应"""
    created_at: str = None
    updated_at: str = None
    projects: List[ProjectSearchResult] = None
    assets: List[AssetSearchResult] = None
    notes: List[NoteSearchResult] = None
    users: List[UserSearchResult] = None
