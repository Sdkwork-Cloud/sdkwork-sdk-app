from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentUpdateRequest:
    """Update document request"""
    title: str = None
    folder_id: str = None
    description: str = None
    tags: List[str] = None
