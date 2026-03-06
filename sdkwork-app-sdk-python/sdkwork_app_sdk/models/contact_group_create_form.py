from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContactGroupCreateForm:
    """Create contact group request"""
    name: str
    member_ids: List[str] = None
