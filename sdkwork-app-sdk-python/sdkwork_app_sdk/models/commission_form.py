from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CommissionForm:
    """佣金表单"""
    amount: float
