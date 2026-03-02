from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectMoveForm:
    """项目移动请求"""
    project_id: str = None
    target_workspace_id: str = None
    move_reason: str = None
    retain_members: bool = None
    retain_settings: bool = None
