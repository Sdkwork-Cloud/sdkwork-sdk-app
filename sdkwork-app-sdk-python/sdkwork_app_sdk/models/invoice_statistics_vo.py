from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvoiceStatisticsVO:
    """发票统计响应"""
    created_at: str = None
    updated_at: str = None
    total_invoices: int = None
    pending_invoices: int = None
    completed_invoices: int = None
    total_amount: float = None
