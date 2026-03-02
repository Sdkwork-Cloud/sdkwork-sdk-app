from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectMoveRequest:
    """移动项目请求"""
    target_workspace_id: str = None
