from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BrowseHistoryQueryForm:
    type: str = None
    target_id: str = None
    page: int = None
    size: int = None
    sort_field: str = None
    sort_order: str = None
