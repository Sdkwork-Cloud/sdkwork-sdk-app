from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DocumentCopyRequest:
    """Copy document request"""
    folder_id: str = None
    title: str = None
