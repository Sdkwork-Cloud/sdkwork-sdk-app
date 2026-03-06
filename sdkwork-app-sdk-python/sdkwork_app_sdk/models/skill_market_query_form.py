from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SkillMarketQueryForm:
    """技能市场查询参数"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    category_id: int = None
    package_id: int = None
    keyword: str = None
    sort_by: str = None
    size: int = None
    page: int = None
