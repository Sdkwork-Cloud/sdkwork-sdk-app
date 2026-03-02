from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceCreateForm:
    """创建发票表单"""
    title: str
    title_type: str = None
    tax_no: str = None
    type: str = None
    total_amount: float = None
