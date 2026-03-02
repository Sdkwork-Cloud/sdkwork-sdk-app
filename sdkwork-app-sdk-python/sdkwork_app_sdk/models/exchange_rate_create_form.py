from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExchangeRateCreateForm:
    """创建汇率表单"""
    base_currency_code: str
    target_currency_code: str
    rate: float
    effective_date: str = None
