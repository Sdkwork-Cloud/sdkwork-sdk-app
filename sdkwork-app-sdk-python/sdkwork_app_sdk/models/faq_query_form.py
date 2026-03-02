from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FaqQueryForm:
    """FAQ查询表单"""
    category_id: str = None
    keyword: str = None
    page: int = None
    size: int = None
