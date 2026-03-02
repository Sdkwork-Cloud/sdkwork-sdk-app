from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PathAnalysisVO:
    """路径分析VO"""
    created_at: str = None
    updated_at: str = None
    start_page: str = None
    end_page: str = None
    steps: List[PathStepVO] = None
    total_users: int = None
    average_steps: float = None
    conversion_rate: float = None
