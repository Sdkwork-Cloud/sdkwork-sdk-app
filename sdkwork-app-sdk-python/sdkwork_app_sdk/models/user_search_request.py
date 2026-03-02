from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserSearchRequest:
    keyword: str = None
    user_type: str = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
