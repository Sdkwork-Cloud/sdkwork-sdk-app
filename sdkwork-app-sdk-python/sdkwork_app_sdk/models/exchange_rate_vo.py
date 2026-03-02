from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExchangeRateVO:
    """汇率响应"""
    created_at: str = None
    updated_at: str = None
    base_currency_code: str = None
    base_currency_name: str = None
    target_currency_code: str = None
    target_currency_name: str = None
    rate: float = None
    effective_date: str = None
