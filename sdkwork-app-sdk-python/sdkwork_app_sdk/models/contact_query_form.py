from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContactQueryForm:
    """Contact query request"""
    keyword: str = None
    region: str = None
    is_online: bool = None
