from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceControlForm:
    """设备控制命令表单"""
    action: str
    params: Dict[str, Any] = None
