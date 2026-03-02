from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SessionInfoVO:
    """会话信息响应"""
    created_at: str = None
    updated_at: str = None
    session_id: str = None
    login_time: str = None
    last_activity_time: str = None
    ip_address: str = None
    location: str = None
    device: str = None
    browser: str = None
    os: str = None
    login_method: str = None
    status: str = None
    remaining_minutes: int = None
