from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VerifyResultVO:
    """验证结果"""
    created_at: str = None
    updated_at: str = None
    valid: bool = None
