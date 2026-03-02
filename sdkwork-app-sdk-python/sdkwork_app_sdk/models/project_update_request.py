from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectUpdateRequest:
    name: str = None
    description: str = None
    type: str = None
    tags: List[str] = None
    is_public: bool = None
