from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserSearchResult:
    id: int = None
    username: str = None
    real_name: str = None
    user_type: str = None
    avatar_url: str = None
