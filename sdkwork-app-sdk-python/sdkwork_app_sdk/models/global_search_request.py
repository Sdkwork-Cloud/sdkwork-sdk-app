from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GlobalSearchRequest:
    keyword: str = None
    type: str = None
    page: int = None
    size: int = None
