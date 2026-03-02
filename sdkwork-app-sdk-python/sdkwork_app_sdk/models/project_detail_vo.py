from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectDetailVO:
    """项目详情响应"""
    created_at: str = None
    updated_at: str = None
    project_id: str = None
    project_name: str = None
    project_title: str = None
    project_description: str = None
    project_type: str = None
    project_type_name: str = None
    project_code: str = None
    project_icon: str = None
    cover_image_url: str = None
    project_tags: List[str] = None
    workspace_id: str = None
    workspace_name: str = None
    creator_id: str = None
    creator_name: str = None
    author: str = None
    site_path: str = None
    domain_prefix: str = None
    start_time: str = None
    end_time: str = None
    is_template: bool = None
    create_time: str = None
    update_time: str = None
    members: List[MemberVO] = None
    status: str = None
    status_name: str = None
    settings: ProjectSettings = None
