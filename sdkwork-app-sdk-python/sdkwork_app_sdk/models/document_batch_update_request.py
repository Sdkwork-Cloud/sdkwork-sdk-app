from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentBatchUpdateRequest:
    """Batch update request similar to Google Docs batchUpdate"""
    requests: List[DocumentBatchOperationRequest]
    strict: bool = None
