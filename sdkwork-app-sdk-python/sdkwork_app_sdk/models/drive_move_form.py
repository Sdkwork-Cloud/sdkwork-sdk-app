from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveMoveForm:
    """Move drive item form"""
    target_folder_id: str = None
