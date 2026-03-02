from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveCopyForm:
    """Copy drive item form"""
    target_folder_id: str = None
    new_name: str = None
