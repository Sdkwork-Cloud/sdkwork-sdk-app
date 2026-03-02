from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentBatchUpdateResultVO:
    """Document batch update result"""
    created_at: str = None
    updated_at: str = None
    document_id: str = None
    document_uuid: str = None
    version_id: str = None
    applied_count: int = None
    skipped_count: int = None
    char_count: int = None
    word_count: int = None
