from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoteVO:
    """投票响应"""
    created_at: str = None
    updated_at: str = None
    vote_id: str = None
    content_type: str = None
    content_id: int = None
    rating: str = None
