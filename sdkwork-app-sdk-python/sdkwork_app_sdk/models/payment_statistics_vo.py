from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentStatisticsVO:
    total_payments: int = None
    pending_payments: int = None
    success_payments: int = None
    failed_payments: int = None
    closed_payments: int = None
    timeout_payments: int = None
