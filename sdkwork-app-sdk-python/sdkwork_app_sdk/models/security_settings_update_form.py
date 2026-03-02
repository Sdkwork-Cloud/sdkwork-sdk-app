from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SecuritySettingsUpdateForm:
    """更新安全设置请求"""
    two_factor_enabled: bool = None
    biometric_enabled: bool = None
    auto_lock_enabled: bool = None
    auto_lock_minutes: int = None
    login_notifications_enabled: bool = None
    ip_restriction_enabled: bool = None
    allowed_ips: List[str] = None
    password_strength_check_enabled: bool = None
    password_expiry_days: int = None
