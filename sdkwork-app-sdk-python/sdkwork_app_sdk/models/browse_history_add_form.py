from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BrowseHistoryAddForm:
    type: str
    target_id: str
    target_name: str = None
    target_description: str = None
    target_icon: str = None
    duration: int = None
    source: str = None
