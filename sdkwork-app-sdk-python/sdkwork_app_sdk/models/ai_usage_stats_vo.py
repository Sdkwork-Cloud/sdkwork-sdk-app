from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AiUsageStatsVO:
    """AI使用统计VO"""
    created_at: str = None
    updated_at: str = None
    stats_id: str = None
    model_name: str = None
    prompt_tokens: int = None
    completion_tokens: int = None
    total_tokens: int = None
    request_count: int = None
    error_count: int = None
    date: str = None
    user_id: str = None
