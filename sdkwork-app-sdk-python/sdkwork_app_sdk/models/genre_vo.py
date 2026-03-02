from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenreVO:
    """流派"""
    name: str = None
    description: str = None
