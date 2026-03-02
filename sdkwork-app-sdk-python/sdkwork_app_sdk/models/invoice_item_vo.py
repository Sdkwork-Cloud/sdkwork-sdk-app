from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceItemVO:
    """发票明细项响应"""
    created_at: str = None
    updated_at: str = None
    item_id: str = None
    product_name: str = None
    specification: str = None
    unit: str = None
    quantity: float = None
    unit_price_excluding_tax: float = None
    amount_excluding_tax: float = None
    tax_amount: float = None
    total_amount: float = None
    tax_rate: float = None
