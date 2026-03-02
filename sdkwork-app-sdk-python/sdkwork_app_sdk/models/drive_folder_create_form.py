from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveFolderCreateForm:
    """Create drive folder form"""
    name: str
    parent_id: str = None
    disk_id: str = None
