from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RetentionAnalysisVO:
    """留存分析VO"""
    created_at: str = None
    updated_at: str = None
    retention_type: str = None
    retention_rates: Dict[str, float] = None
    average_retention_rate: float = None
    total_users: int = None
    cohort_sizes: Dict[str, int] = None
