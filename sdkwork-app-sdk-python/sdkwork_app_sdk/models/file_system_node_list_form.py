from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemNodeListForm:
    """Filesystem node list query form"""
    disk_id: str = None
    parent_id: str = None
    keyword: str = None
    sort_field: str = None
    sort_order: str = None
    page_num: int = None
    page_size: int = None
