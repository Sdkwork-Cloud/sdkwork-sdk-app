from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceDetailVO:
    """发票详情响应"""
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
    amount_excluding_tax: float = None
    tax_amount: float = None
    total_amount: float = None
    tax_rate: float = None
    currency: str = None
    bank_name: str = None
    bank_account: str = None
    register_address: str = None
    register_phone: str = None
    electronic_url: str = None
    invoice_time: str = None
    items: List[InvoiceItemVO] = None
