from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WorkspaceSettings:
    """工作空间设置"""
    is_public: bool = None
    allow_invite: bool = None
    allow_create_project: bool = None
    allow_file_upload: bool = None
