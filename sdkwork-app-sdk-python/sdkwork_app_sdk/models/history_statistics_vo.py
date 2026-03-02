from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class HistoryStatisticsVO:
    """历史统计响应"""
    created_at: str = None
    updated_at: str = None
    browse_count: int = None
    operation_count: int = None
    generation_count: int = None
    login_count: int = None
    active_session_count: int = None
    today_operation_count: int = None
    weekly_operation_count: int = None
    monthly_operation_count: int = None
    most_frequent_action: str = None
    most_frequent_browse_type: str = None
