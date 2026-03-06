from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteContentVO:
    """笔记正文响应"""
    created_at: str = None
    updated_at: str = None
    note_id: str = None
    note_uuid: str = None
    content_id: str = None
    version_id: str = None
    encoding: str = None
    prompt: str = None
    thinking_content: str = None
    text: str = None
    contents: Dict[str, str] = None
    char_count: int = None
    word_count: int = None
