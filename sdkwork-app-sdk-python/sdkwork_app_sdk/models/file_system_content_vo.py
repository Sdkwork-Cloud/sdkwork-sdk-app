from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemContentVO:
    """Filesystem file content object"""
    created_at: str = None
    updated_at: str = None
    node_id: str = None
    node_uuid: str = None
    content_id: str = None
    file_version: str = None
    encoding: str = None
    prompt: str = None
    thinking_content: str = None
    text: str = None
    contents: Dict[str, str] = None
    char_count: int = None
    word_count: int = None
