from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareRecordVO:
    """分享记录响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    share_id: str = None
    share_type: str = None
    title: str = None
    create_time: str = None
    expire_time: str = None
    status: str = None
    visit_count: int = None
