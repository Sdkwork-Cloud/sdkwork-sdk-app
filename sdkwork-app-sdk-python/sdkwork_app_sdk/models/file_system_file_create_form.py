from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemFileCreateForm:
    """Create file request"""
    name: str
    parent_id: str = None
    disk_id: str = None
    mime_type: str = None
    asset_type: str = None
    description: str = None
    tags: List[str] = None
    text: str = None
    contents: Dict[str, str] = None
    prompt: str = None
    thinking_content: str = None
    encoding: str = None
