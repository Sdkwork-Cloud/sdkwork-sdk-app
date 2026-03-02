from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteSearchResult:
    id: int = None
    title: str = None
    summary: str = None
    folder_id: str = None
    folder_name: str = None
