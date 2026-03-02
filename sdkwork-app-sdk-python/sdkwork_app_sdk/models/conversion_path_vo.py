from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ConversionPathVO:
    """转化路径VO"""
    created_at: str = None
    updated_at: str = None
    path_id: str = None
    steps: List[str] = None
    conversion_count: int = None
    conversion_rate: float = None
    average_time: float = None
    start_page: str = None
    end_page: str = None
