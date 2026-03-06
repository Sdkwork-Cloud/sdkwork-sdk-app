from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceMessageVO:
    """设备消息响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    message_id: str = None
    device_id: str = None
    type: str = None
    direction: str = None
    payload: Dict[str, Any] = None
    topic: str = None
    processed: bool = None
    error: str = None
