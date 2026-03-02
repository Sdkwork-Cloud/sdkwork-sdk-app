from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetListForm:
    """资产列表查询请求"""
    type: str = None
    folder_id: str = None
    keyword: str = None
    sort_field: str = None
    sort_direction: str = None
    page_num: int = None
    page_size: int = None
