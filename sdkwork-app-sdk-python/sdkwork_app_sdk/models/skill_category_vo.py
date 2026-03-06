from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkillCategoryVO:
    """技能分类"""
    id: int = None
    code: str = None
    name: str = None
    icon: str = None
