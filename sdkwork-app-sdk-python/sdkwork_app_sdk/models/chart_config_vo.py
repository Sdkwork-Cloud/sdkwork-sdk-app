from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChartConfigVO:
    """图表配置"""
    show_legend: bool = None
    show_tooltip: bool = None
    responsive: bool = None
    height: int = None
