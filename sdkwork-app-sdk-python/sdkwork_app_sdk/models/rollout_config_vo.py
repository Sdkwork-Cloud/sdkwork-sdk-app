from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RolloutConfigVO:
    """发布配置响应"""
    created_at: str = None
    updated_at: str = None
    rollout_key: str = None
    rollout_name: str = None
    config: Dict[str, Any] = None
    status: str = None
