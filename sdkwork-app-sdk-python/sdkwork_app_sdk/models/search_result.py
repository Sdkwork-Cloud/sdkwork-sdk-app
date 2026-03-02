from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SearchResult:
    id: str = None
    title: str = None
    content: str = None
    type: str = None
    path: str = None
