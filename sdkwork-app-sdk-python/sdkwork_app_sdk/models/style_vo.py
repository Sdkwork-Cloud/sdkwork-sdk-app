from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StyleVO:
    """风格"""
    name: str = None
    description: str = None
    genre: str = None
