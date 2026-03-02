from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveBatchDeleteForm:
    """Batch delete drive items form"""
    item_ids: List[str]
