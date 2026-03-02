from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageCreateForm:
    """创建图片表单"""
    title: str = None
    description: str = None
    url: str
    format: str = None
    width: int = None
    height: int = None
