from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoteDetailVO:
    """投票详情响应"""
    created_at: str = None
    updated_at: str = None
    vote_id: str = None
    user_id: int = None
    content_type: str = None
    content_id: int = None
    rating: str = None
    source: str = None
    client_ip: str = None
    device_info: str = None
