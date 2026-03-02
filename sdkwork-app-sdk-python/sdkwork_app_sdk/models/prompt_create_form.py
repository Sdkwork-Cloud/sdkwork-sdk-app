from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptCreateForm:
    """创建提示语请求"""
    title: str
    content: str
    type: str
    biz_type: str
    description: str = None
    cate_id: int = None
    sort: int = None
    parameters: Dict[str, Any] = None
    model: str = None
    is_public: bool = None
