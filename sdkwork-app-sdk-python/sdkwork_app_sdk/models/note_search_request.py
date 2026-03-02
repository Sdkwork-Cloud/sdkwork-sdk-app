from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteSearchRequest:
    keyword: str = None
    folder_id: str = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
