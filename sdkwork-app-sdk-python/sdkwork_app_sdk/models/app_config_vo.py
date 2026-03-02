from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppConfigVO:
    """应用配置响应"""
    created_at: str = None
    updated_at: str = None
    version: str = None
    build_number: str = None
    api_version: str = None
    server_time: int = None
    features: Dict[str, bool] = None
    system_config: Dict[str, Any] = None
    maintenance_mode: bool = None
    maintenance_message: str = None
