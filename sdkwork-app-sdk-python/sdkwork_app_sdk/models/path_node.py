from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PathNode:
    id: int = None
    name: str = None
    code: str = None
    level: int = None
    is_current: bool = None
