from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppCreateForm:
    """创建应用表单"""
    name: str
    description: str = None
    app_type: str = None
    project_id: int = None
    install_skill: AppInstallSkill
