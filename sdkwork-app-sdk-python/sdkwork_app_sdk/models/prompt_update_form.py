from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptUpdateForm:
    """更新提示语请求"""
    title: str = None
    content: str = None
    description: str = None
    cate_id: int = None
    enabled: bool = None
    sort: int = None
    parameters: Dict[str, Any] = None
    model: str = None
    is_public: bool = None
