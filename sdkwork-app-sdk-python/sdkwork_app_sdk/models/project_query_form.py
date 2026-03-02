from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectQueryForm:
    """项目查询请求"""
    workspace_id: str = None
    keyword: str = None
    project_name: str = None
    type: str = None
    project_tags: List[str] = None
    status: str = None
    creator_id: str = None
    start_time: str = None
    end_time: str = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
