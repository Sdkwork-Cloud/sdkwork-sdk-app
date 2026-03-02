from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OperationHistoryQueryForm:
    action: str = None
    result: str = None
    page: int = None
    size: int = None
    sort_field: str = None
    sort_order: str = None
