from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageUpdateForm:
    """更新图片表单"""
    title: str = None
    description: str = None
