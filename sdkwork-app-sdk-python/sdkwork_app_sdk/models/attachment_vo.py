from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AttachmentVO:
    """消息附件"""
    id: str = None
    name: str = None
    type: str = None
    size: int = None
    url: str = None
    thumbnail_url: str = None
