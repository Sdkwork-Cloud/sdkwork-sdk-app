from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ServiceStatus:
    """服务状态"""
    api: str = None
    database: str = None
    cache: str = None
    storage: str = None
    third_party: str = None
