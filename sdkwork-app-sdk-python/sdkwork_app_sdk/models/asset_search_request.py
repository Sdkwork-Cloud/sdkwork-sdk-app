from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetSearchRequest:
    keyword: str = None
    type: str = None
    workspace_id: str = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
