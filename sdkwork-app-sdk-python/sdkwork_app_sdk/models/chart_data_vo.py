from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChartDataVO:
    """图表数据响应"""
    created_at: str = None
    updated_at: str = None
    type: str = None
    title: str = None
    labels: List[str] = None
    datasets: List[DatasetVO] = None
    config: ChartConfigVO = None
