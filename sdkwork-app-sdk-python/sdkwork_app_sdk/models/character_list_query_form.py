from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterListQueryForm:
    """角色列表查询请求"""
    style: str = None
    keyword: str = None
    page_num: int = None
    page_size: int = None
    sort_by: str = None
    sort_order: str = None
