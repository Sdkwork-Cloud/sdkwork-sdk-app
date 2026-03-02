from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountRiskVO:
    """账号风险检测响应"""
    created_at: str = None
    updated_at: str = None
    user_id: str = None
    device_id: str = None
    risk_level: str = None
    risk_score: int = None
    risks: List[RiskItem] = None
    suggestion: str = None
    need_verification: bool = None
