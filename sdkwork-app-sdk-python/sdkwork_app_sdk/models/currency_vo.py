from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CurrencyVO:
    """货币响应"""
    created_at: str = None
    updated_at: str = None
    code: str = None
    name: str = None
    symbol: str = None
    currency_type: str = None
    precision_digits: int = None
    is_active: bool = None
    description: str = None
