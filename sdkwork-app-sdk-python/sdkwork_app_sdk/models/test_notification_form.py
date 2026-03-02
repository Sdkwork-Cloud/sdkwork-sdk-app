from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TestNotificationForm:
    """测试通知表单"""
    title: str
    content: str
    type: str = None
    device_id: str = None
