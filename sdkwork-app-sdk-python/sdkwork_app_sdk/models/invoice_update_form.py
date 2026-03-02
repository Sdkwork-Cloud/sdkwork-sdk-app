from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceUpdateForm:
    """更新发票表单"""
    title: str = None
    tax_no: str = None
    bank_name: str = None
    bank_account: str = None
    register_address: str = None
    register_phone: str = None
