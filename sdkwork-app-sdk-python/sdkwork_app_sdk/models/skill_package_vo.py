from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkillPackageVO:
    """技能分包信息"""
    created_at: str = None
    updated_at: str = None
    package_id: int = None
    package_key: str = None
    name: str = None
    summary: str = None
    description: str = None
    icon: str = None
    cover_image: str = None
    category_id: int = None
    category_name: str = None
    tags: List[str] = None
    featured: bool = None
    sort_weight: int = None
    skill_count: int = None
