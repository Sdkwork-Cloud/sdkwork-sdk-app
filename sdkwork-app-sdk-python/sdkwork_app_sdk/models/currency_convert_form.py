from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CurrencyConvertForm:
    """货币兑换表单"""
    base_currency_code: str
    target_currency_code: str
    amount: float
