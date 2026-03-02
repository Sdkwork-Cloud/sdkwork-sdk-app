from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectListQueryRequest:
    keyword: str = None
    workspace_id: str = None
    type: str = None
    status: str = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
