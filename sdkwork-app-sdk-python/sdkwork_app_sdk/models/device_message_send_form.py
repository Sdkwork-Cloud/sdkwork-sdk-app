from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceMessageSendForm:
    """设备消息发送表单"""
    type: str
    payload: Dict[str, Any]
    topic: str = None
