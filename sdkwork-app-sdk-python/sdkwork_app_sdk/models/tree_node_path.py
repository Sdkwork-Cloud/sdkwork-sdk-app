from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TreeNodePath:
    nodes: List[PathNode] = None
    level: int = None
    depth: int = None
    path_name: str = None
    root_node: PathNode = None
    parent_node: PathNode = None
    path_ids: List[int] = None
    current_node: PathNode = None
