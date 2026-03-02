from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SystemStatusVO:
    """系统状态VO"""
    created_at: str = None
    updated_at: str = None
    status: str = None
    message: str = None
    timestamp: str = None
    version: str = None
    services: ServiceStatus = None
