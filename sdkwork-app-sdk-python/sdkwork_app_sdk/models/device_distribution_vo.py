from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DeviceDistributionVO:
    """设备分布VO"""
    created_at: str = None
    updated_at: str = None
    device_type: str = None
    device_model: str = None
    os_type: str = None
    os_version: str = None
    user_count: int = None
    percentage: float = None
    active_count: int = None
