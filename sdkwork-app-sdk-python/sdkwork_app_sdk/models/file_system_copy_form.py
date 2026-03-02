from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemCopyForm:
    """Copy node request"""
    target_parent_id: str = None
    target_disk_id: str = None
    name: str = None
    copy_content: bool = None
