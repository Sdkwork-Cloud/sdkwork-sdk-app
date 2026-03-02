from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationBatchDeleteForm:
    """批量删除通知表单"""
    notification_ids: List[str]
