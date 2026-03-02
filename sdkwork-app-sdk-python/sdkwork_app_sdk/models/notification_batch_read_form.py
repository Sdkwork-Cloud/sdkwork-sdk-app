from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NotificationBatchReadForm:
    """批量标记通知已读表单"""
    notification_ids: List[str]
