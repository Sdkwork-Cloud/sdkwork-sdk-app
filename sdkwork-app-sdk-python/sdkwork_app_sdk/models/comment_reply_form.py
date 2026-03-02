from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CommentReplyForm:
    """回复评论表单"""
    content: str
    device_info: str = None
