from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptHistoryQueryForm:
    """查询提示语历史记录请求"""
    prompt_id: int = None
    keyword: str = None
    model: str = None
    success: bool = None
    page: int = None
    size: int = None
    sort_by: str = None
    sort_direction: str = None
