from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationDetailVO:
    """通知详情VO"""
    created_at: str = None
    updated_at: str = None
    notification_id: str = None
    title: str = None
    content: str = None
    type: str = None
    status: str = None
    source: str = None
    redirect_url: str = None
    is_read: bool = None
    read_at: str = None
    extra_data: Dict[str, Any] = None
