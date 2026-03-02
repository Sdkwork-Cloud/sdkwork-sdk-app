from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemFolderCreateForm:
    """Create folder request"""
    name: str
    parent_id: str = None
    disk_id: str = None
    description: str = None
    tags: List[str] = None
