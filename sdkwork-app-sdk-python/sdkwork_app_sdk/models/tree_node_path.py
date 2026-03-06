from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TreeNodePath:
    nodes: List[PathNode] = None
    level: int = None
    depth: int = None
    path_ids: List[int] = None
    path_name: str = None
    parent_node: PathNode = None
    root_node: PathNode = None
    current_node: PathNode = None
