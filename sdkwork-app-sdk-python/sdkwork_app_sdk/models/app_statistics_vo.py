from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppStatisticsVO:
    """应用统计响应"""
    created_at: str = None
    updated_at: str = None
    total_apps: int = None
