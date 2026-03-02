from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UiConfigVO:
    """UI配置响应"""
    created_at: str = None
    updated_at: str = None
    config_key: str = None
    config_name: str = None
    ui_config: Dict[str, Any] = None
    version: str = None
