from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TagVO:
    """标签响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    code: str = None
    color: str = None
    description: str = None
    count: int = None
    status: int = None
