from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptEnhanceResponse:
    prompt: str
    tokens_estimated: int = None
