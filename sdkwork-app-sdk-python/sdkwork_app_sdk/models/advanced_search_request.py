from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AdvancedSearchRequest:
    keyword: str = None
    type: str = None
    filters: Dict[str, Any] = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
