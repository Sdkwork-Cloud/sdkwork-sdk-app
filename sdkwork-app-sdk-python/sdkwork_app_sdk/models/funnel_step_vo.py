from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FunnelStepVO:
    """漏斗步骤VO"""
    created_at: str = None
    updated_at: str = None
    event_name: str = None
    user_count: int = None
    conversion_rate: float = None
    step_conversion_rate: float = None
