from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SecuritySettingsVO:
    """安全设置响应"""
    created_at: str = None
    updated_at: str = None
    two_factor_enabled: bool = None
    biometric_enabled: bool = None
    auto_lock_enabled: bool = None
    auto_lock_minutes: int = None
    login_notifications_enabled: bool = None
    ip_restriction_enabled: bool = None
    allowed_ips: List[str] = None
    password_strength_check_enabled: bool = None
    password_expiry_days: int = None
    last_password_change_time: str = None
