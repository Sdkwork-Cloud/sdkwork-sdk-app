from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CommentStatisticsVO:
    """评论统计响应"""
    created_at: str = None
    updated_at: str = None
    total_comments: int = None
