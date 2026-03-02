from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveContentVO:
    """Drive file content"""
    created_at: str = None
    updated_at: str = None
    file_id: str = None
    file_uuid: str = None
    file_version: str = None
    content_id: str = None
    encoding: str = None
    prompt: str = None
    thinking_content: str = None
    text: str = None
    contents: Dict[str, str] = None
