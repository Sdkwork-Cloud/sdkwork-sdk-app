from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InstrumentVO:
    """乐器"""
    name: str = None
    description: str = None
