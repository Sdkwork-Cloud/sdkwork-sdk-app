from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class NoteContentUpdateRequest:
    """更新笔记正文请求"""
    text: str = None
    contents: Dict[str, str] = None
    prompt: str = None
    thinking_content: str = None
    encoding: str = None
    bump_version: bool = None
