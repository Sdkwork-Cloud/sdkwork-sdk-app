from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrganizationStatisticsVO:
    """组织统计响应"""
    created_at: str = None
    updated_at: str = None
    total_organizations: int = None
    active_organizations: int = None
    total_members: int = None
    total_departments: int = None
    total_positions: int = None
