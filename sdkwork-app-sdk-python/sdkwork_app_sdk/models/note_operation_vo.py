from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteOperationVO:
    """笔记操作响应"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    note_id: int = None
    uuid: str = None
    title: str = None
    operation_type: str = None
    operation_time: str = None
    message: str = None
