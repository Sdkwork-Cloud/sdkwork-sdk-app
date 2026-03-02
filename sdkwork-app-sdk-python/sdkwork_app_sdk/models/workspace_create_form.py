from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WorkspaceCreateForm:
    """工作空间创建请求"""
    workspace_name: str = None
    workspace_description: str = None
    workspace_icon: str = None
    workspace_color: str = None
    workspace_type: str = None
    members: List[WorkspaceMember] = None
    settings: WorkspaceSettings = None
