from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TenantStatisticsVO:
    """租户统计响应"""
    created_at: str = None
    updated_at: str = None
    total_tenants: int = None
    active_tenants: int = None
    frozen_tenants: int = None
    closed_tenants: int = None
