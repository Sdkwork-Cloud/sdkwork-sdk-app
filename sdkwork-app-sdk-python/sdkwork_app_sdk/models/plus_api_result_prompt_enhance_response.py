from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultPromptEnhanceResponse:
    code: int
    msg: str
    data: PromptEnhanceResponse = None
    timestamp: str = None
    trace_id: str = None
