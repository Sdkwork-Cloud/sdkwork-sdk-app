from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StorageUsageVO:
    total_size: int = None
    used_size: int = None
    remaining_size: int = None
    file_count: int = None
