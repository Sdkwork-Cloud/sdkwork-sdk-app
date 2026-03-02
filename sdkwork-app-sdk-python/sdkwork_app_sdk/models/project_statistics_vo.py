from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectStatisticsVO:
    """项目统计响应"""
    created_at: str = None
    updated_at: str = None
    project_id: str = None
    total_files: int = None
    total_members: int = None
    total_conversations: int = None
    document_count: int = None
    tag_count: int = None
    last_activity_time: str = None
    activity_stats: Dict[str, int] = None
    document_type_stats: Dict[str, int] = None
