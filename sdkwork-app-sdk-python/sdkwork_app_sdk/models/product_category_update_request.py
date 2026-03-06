from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductCategoryUpdateRequest:
    name: str = None
    parent_id: str = None
    description: str = None
    icon: str = None
    sort: int = None
    enabled: bool = None
