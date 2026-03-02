from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionCreateForm:
    """创建合集表单"""
    name: str
    description: str = None
    type: str = None
    parent_id: int = None
