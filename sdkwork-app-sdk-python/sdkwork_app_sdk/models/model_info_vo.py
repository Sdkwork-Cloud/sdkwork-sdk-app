from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelInfoVO:
    """Model summary response"""
    created_at: str = None
    updated_at: str = None
    model_id: str = None
    model_key: str = None
    model: str = None
    vendor_model: str = None
    name: str = None
    description: str = None
    channel: str = None
    model_type: str = None
    family: str = None
    version: str = None
    open_source: bool = None
    status: str = None
    usage_count: int = None
