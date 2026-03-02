from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelTypeVO:
    """模型类型响应"""
    created_at: str = None
    updated_at: str = None
    type: str = None
    name: str = None
