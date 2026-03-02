from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiErrorResult:
    code: int
    msg: str
    data: Any = None
    timestamp: str = None
    trace_id: str = None
