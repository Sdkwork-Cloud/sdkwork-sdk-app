from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BlockCheckVO:
    """拉黑检查响应"""
    created_at: str = None
    updated_at: str = None
    is_blocked: bool = None
    block_time: str = None
    block_reason: str = None
