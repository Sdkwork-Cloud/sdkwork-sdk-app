from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FunnelAnalysisVO:
    """漏斗分析VO"""
    created_at: str = None
    updated_at: str = None
    funnel_name: str = None
    steps: List[FunnelStepVO] = None
    overall_conversion_rate: float = None
    total_users: int = None
    converted_users: int = None
