from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CurrencyConvertVO:
    """货币兑换响应"""
    created_at: str = None
    updated_at: str = None
    base_currency_code: str = None
    target_currency_code: str = None
    original_amount: float = None
    rate: float = None
    converted_amount: float = None
