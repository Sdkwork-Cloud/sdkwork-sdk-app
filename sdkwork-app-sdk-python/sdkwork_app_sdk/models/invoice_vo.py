from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceVO:
    """发票响应"""
    created_at: str = None
    updated_at: str = None
    invoice_id: str = None
    title: str = None
    title_type: str = None
    tax_no: str = None
    type: str = None
    status: str = None
    invoice_code: str = None
    invoice_no: str = None
    total_amount: float = None
    currency: str = None
