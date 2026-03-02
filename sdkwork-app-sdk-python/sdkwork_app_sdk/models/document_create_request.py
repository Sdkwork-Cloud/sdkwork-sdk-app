from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentCreateRequest:
    """Create document request"""
    title: str = None
    content: str = None
    folder_id: str = None
    disk_id: str = None
    description: str = None
    mime_type: str = None
    tags: List[str] = None
