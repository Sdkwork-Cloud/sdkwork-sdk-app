from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectUpdateForm:
    """项目更新请求"""
    project_id: str = None
    project_name: str = None
    project_description: str = None
    project_icon: str = None
    project_color: str = None
    project_tags: List[str] = None
    settings: ProjectSettings = None
