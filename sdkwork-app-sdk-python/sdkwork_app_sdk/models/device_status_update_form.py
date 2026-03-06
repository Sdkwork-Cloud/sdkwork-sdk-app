from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceStatusUpdateForm:
    """设备状态更新表单"""
    status: str
