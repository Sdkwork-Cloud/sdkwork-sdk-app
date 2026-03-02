from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveRenameForm:
    """Rename drive item form"""
    name: str
