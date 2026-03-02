from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectCreateRequest:
    name: str = None
    description: str = None
    workspace_id: str = None
    type: str = None
    tags: List[str] = None
    is_public: bool = None
