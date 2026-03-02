from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PathStepVO:
    """路径步骤VO"""
    created_at: str = None
    updated_at: str = None
    page_url: str = None
    page_title: str = None
    user_count: int = None
    percentage: float = None
    next_steps: List[PathStepVO] = None
