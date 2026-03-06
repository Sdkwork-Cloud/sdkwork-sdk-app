from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptEnhanceResponse:
    """Prompt enhance response"""
    prompt: str = None
    tokens_estimated: int = None
