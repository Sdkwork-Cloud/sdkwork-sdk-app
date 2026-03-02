from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CurrencyCreateForm:
    """创建货币表单"""
    code: str
    name: str
    symbol: str = None
    currency_type: str
    precision_digits: int = None
    is_active: bool = None
    description: str = None
