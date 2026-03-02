from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectVO:
    """项目响应"""
    created_at: str = None
    updated_at: str = None
    project_id: str = None
    project_name: str = None
    project_description: str = None
    project_type: str = None
    project_icon: str = None
    project_color: str = None
    project_tags: List[str] = None
    workspace_id: str = None
    workspace_name: str = None
    creator_id: str = None
    creator_name: str = None
    create_time: str = None
    update_time: str = None
    member_count: int = None
    file_count: int = None
    status: str = None
    is_public: bool = None
    user_permissions: List[str] = None
