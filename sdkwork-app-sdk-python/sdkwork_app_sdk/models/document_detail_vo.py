from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentDetailVO:
    """Document detail response"""
    created_at: str = None
    updated_at: str = None
    document_id: str = None
    document_uuid: str = None
    title: str = None
    folder_id: str = None
    asset_type: str = None
    mime_type: str = None
    description: str = None
    tags: List[str] = None
    status: str = None
    summary: str = None
    word_count: int = None
    char_count: int = None
    path: str = None
    object_key: str = None
    version_id: str = None
    content_version: str = None
    extension: str = None
