from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PromptEnhanceRequest:
    """Prompt enhance request"""
    prompt: str
    scene: str = None
    style: str = None
    language: str = None
    max_words: int = None
