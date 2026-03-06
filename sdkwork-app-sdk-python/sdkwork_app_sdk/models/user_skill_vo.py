from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserSkillVO:
    """用户技能安装信息"""
    created_at: str = None
    updated_at: str = None
    user_skill_id: int = None
    skill_id: int = None
    enabled: bool = None
    config: Dict[str, Any] = None
    installed_at: str = None
    last_enabled_at: str = None
    last_used_at: str = None
    used_count: int = None
    skill: SkillVO = None
