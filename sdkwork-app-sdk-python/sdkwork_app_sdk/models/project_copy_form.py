from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectCopyForm:
    """项目复制请求"""
    source_project_id: str = None
    target_workspace_id: str = None
    new_name: str = None
    new_project_description: str = None
    copy_members: bool = None
    copy_files: bool = None
    copy_settings: bool = None
    copy_reason: str = None
