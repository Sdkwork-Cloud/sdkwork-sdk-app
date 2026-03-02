from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MoodVO:
    """情绪"""
    name: str = None
    description: str = None
