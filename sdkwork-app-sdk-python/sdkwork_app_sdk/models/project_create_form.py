from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectCreateForm:
    """项目创建请求"""
    workspace_id: str = None
    project_name: str = None
    project_description: str = None
    project_type: str = None
    project_icon: str = None
    project_color: str = None
    project_tags: List[str] = None
    members: List[ProjectMember] = None
    settings: ProjectSettings = None
