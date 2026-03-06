from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContactGroupUpdateForm:
    """Update contact group request"""
    name: str = None
    member_ids: List[str] = None
