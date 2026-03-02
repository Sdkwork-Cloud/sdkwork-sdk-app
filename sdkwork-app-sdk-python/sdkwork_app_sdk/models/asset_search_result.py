from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetSearchResult:
    id: str = None
    name: str = None
    type: str = None
    path: str = None
    workspace_id: str = None
