from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationHistoryQueryForm:
    """生成历史查询请求"""
    page_num: int = None
    page_size: int = None
    sort_field: str = None
    sort_direction: str = None
    generation_type: str = None
    status: str = None
    keyword: str = None
    start_time: str = None
    end_time: str = None
    size: int = None
    page: int = None
