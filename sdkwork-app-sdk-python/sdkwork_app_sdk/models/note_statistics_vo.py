from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteStatisticsVO:
    """笔记统计响应"""
    created_at: str = None
    updated_at: str = None
    total_notes: int = None
    total_folders: int = None
    favorited_notes: int = None
    this_month_notes: int = None
    this_week_notes: int = None
    today_notes: int = None
    total_words: int = None
    last_update_time: str = None
    folder_note_counts: Dict[str, int] = None
    tag_usage_counts: Dict[str, int] = None
