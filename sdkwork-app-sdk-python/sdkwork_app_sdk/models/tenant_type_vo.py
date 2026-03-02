from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TenantTypeVO:
    """租户类型响应"""
    created_at: str = None
    updated_at: str = None
    type: str = None
    name: str = None
