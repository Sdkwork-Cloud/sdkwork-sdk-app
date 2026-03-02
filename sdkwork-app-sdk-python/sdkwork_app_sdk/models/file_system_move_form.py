from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemMoveForm:
    """Move node request"""
    target_parent_id: str = None
    target_disk_id: str = None
