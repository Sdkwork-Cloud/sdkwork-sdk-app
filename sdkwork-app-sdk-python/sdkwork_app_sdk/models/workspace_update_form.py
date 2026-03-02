from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WorkspaceUpdateForm:
    """工作空间更新请求"""
    workspace_id: str = None
    workspace_name: str = None
    workspace_description: str = None
    workspace_icon: str = None
    workspace_color: str = None
    settings: WorkspaceSettings = None
