from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TagCreateForm:
    """创建标签请求"""
    name: str
    code: str
    color: str = None
    description: str = None
    status: int = None
