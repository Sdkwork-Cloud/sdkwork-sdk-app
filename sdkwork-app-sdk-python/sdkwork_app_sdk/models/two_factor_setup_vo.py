from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TwoFactorSetupVO:
    """两步验证设置响应"""
    created_at: str = None
    updated_at: str = None
    enabled: bool = None
    method: str = None
    qr_code_data: str = None
    secret_key: str = None
    verification_code: str = None
    recovery_codes: List[str] = None
