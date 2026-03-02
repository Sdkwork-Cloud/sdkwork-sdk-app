from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentOperationVO:
    """Document operation response"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    operation_type: str = None
    message: str = None
    document_id: str = None
    document_uuid: str = None
    title: str = None
    operation_time: str = None
