from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WorkspaceVO:
    """工作空间响应"""
    created_at: str = None
    updated_at: str = None
    workspace_id: str = None
    workspace_name: str = None
    workspace_description: str = None
    workspace_icon: str = None
    workspace_color: str = None
    workspace_type: str = None
    creator_id: str = None
    creator_name: str = None
    create_time: str = None
    update_time: str = None
    member_count: int = None
    project_count: int = None
    status: str = None
    is_public: bool = None
    user_role: str = None
    user_permissions: List[str] = None
    settings: WorkspaceSettings = None
