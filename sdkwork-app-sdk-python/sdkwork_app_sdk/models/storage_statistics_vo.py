from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StorageStatisticsVO:
    """存储统计响应"""
    created_at: str = None
    updated_at: str = None
    total_storage: int = None
    used_storage: int = None
    remaining_storage: int = None
    usage_rate: float = None
    type_distribution: StorageTypeDistributionVO = None
    trend: StorageTrendVO = None
