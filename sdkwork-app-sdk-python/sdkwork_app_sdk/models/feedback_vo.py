from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedbackVO:
    """反馈信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    content: str = None
    status: str = None
    submit_time: str = None
    process_time: str = None
