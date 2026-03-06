from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContactGroupVO:
    """Contact group"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    member_ids: List[str] = None
