from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceRegisterForm:
    """设备注册表单"""
    device_type: str
    device_id: str
    push_token: str
    os_version: str = None
    app_version: str = None
