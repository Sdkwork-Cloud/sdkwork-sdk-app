from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationStatisticsVO:
    """生成统计响应"""
    created_at: str = None
    updated_at: str = None
    today_count: int = None
    week_count: int = None
    month_count: int = None
    total_count: int = None
    avg_generation_time: int = None
    max_generation_time: int = None
    min_generation_time: int = None
    success_rate: float = None
    most_used_model: str = None
    type_distribution: GenerationTypeDistributionVO = None
