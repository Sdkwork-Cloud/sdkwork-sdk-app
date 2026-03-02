from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentBatchOperationRequest:
    """Batch operation request for document content"""
    type: str
    index: int = None
    start_index: int = None
    end_index: int = None
    text: str = None
    search_text: str = None
    replace_text: str = None
