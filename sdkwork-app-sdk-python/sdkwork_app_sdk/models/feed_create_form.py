from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FeedCreateForm:
    """Feed create form"""
    content: str
    title: str = None
    category_id: int = None
    images: List[str] = None
    source: str = None
    source_url: str = None
