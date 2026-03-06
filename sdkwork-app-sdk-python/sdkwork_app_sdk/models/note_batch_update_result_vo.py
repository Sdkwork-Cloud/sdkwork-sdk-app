from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteBatchUpdateResultVO:
    """笔记批量更新结果"""
    created_at: str = None
    updated_at: str = None
    note_id: str = None
    note_uuid: str = None
    version_id: str = None
    applied_count: int = None
    skipped_count: int = None
    char_count: int = None
    word_count: int = None
