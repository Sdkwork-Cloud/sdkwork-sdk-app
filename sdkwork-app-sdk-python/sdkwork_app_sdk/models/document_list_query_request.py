from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentListQueryRequest:
    """List documents query request"""
    keyword: str = None
    folder_id: str = None
    sort_field: str = None
    sort_order: str = None
    page_num: int = None
    page_size: int = None
