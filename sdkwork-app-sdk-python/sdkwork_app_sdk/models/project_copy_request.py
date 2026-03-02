from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectCopyRequest:
    target_workspace_id: str = None
    new_name: str = None
