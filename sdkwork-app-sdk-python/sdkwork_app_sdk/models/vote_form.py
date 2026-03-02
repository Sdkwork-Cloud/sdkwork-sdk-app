from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoteForm:
    """投票表单"""
    content_type: str
    content_id: int
    rating: str
    source: str = None
    device_info: str = None
