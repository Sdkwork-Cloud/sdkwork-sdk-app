from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceVO:
    """设备响应"""
    created_at: str = None
    updated_at: str = None
    device_id: str = None
    device_type: str = None
    device_name: str = None
    push_token: str = None
    os_version: str = None
    app_version: str = None
    is_active: bool = None
    register_time: str = None
    last_active_at: str = None
