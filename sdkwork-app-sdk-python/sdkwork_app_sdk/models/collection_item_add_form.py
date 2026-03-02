from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionItemAddForm:
    """添加内容到合集表单"""
    content_type: str
    content_id: int
    title: str = None
    description: str = None
    position: int = None
