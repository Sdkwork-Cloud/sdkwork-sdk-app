from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class HistoryBatchDeleteForm:
    history_ids: List[str]
    type: str = None
