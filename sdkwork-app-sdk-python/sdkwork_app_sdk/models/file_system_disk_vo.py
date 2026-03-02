from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemDiskVO:
    """Filesystem disk object"""
    created_at: str = None
    updated_at: str = None
    disk_id: str = None
    disk_uuid: str = None
    name: str = None
    type: str = None
    owner: str = None
    owner_id: str = None
    total_size: int = None
    used_size: int = None
    remaining_size: int = None
    usage_rate: float = None
    file_count: int = None
    description: str = None
