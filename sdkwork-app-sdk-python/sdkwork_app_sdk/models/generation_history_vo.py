from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationHistoryVO:
    """生成历史响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    type: str = None
    task_id: str = None
    title: str = None
    description: str = None
    status: str = None
    duration: int = None
    result_url: str = None
    result_preview: str = None
    start_time: str = None
    end_time: str = None
    model_name: str = None
    token_usage: int = None
