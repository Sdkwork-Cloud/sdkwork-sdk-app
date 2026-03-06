from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContactStatsVO:
    """Contact stats"""
    created_at: str = None
    updated_at: str = None
    total: int = None
    online: int = None
    new_today: int = None
