from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectSettings:
    """项目设置"""
    is_public: bool = None
    allow_comments: bool = None
    allow_file_upload: bool = None
    allow_invite_members: bool = None
