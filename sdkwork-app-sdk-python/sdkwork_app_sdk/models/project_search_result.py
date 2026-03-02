from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectSearchResult:
    id: str = None
    name: str = None
    description: str = None
    workspace_id: str = None
    workspace_name: str = None
    type: str = None
