from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceCancelForm:
    """作废发票表单"""
    cancel_reason: str = None
